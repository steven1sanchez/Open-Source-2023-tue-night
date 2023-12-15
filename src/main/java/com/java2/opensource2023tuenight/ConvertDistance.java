package com.java2.opensource2023tuenight;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.text.DecimalFormat;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "convertDistance", urlPatterns = {"/convertdistance", "/convert-distance"})
public class ConvertDistance extends HttpServlet {

    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/distance-converter.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversion = req.getParameter("conversion");
        String distance = req.getParameter("distance");
        results.clear();
        results.put("conversion", conversion);
        results.put("distance", distance);
        convertDistance(conversion, distance);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/distance-converter.jsp").forward(req, resp);
    }

    private void convertDistance(String conversion, String distance) {
        if (!isValidConversion(conversion)) {
            results.put("conversionError", "Select a conversion type");
        }
        if (!isANumber(distance)) {
            results.put("distanceError", "Please input a valid distance");
        }
        if (!results.containsKey("conversionError") && !results.containsKey("distanceError")) {
            double parsedDistance = Double.parseDouble(distance);
            double conversionResult;
            switch (conversion) {
                case "m-km":
                    conversionResult = roundToDecimalPlaces((parsedDistance / 1000), 2);
                    results.put("distanceConverted", formatDouble(parsedDistance) + " meters is " +
                            formatDouble(conversionResult) + " kilometers");
                    break;
                case "m-mi":
                    conversionResult = roundToDecimalPlaces((kilometersToMiles(parsedDistance / 1000)),
                            2);
                    results.put("distanceConverted", formatDouble(parsedDistance) + " meters is " +
                            formatDouble(conversionResult) + " miles");
                    break;
                case "km-m":
                    conversionResult = roundToDecimalPlaces((parsedDistance * 1000), 2);
                    results.put("distanceConverted", formatDouble(parsedDistance) + " kilometers is " +
                            formatDouble(conversionResult) + " meters");
                    break;
                case "km-mi":
                    conversionResult = roundToDecimalPlaces(kilometersToMiles(parsedDistance),
                            2);
                    results.put("distanceConverted", formatDouble(parsedDistance) + " kilometers is " +
                            formatDouble(conversionResult) + " miles");
                    break;
                case "mi-m":
                    conversionResult = roundToDecimalPlaces(milesToKilometers(parsedDistance) *1000,
                            2);
                    results.put("distanceConverted", formatDouble(parsedDistance) + " miles is " +
                            formatDouble(conversionResult) + " meters");
                    break;
                case "mi-km":
                    conversionResult = roundToDecimalPlaces(milesToKilometers(parsedDistance),
                            2);
                    results.put("distanceConverted", formatDouble(parsedDistance) + " miles is " +
                            formatDouble(conversionResult) + " kilometers");
                    break;
            }
        }
    }

    private static boolean isValidConversion(String conversion) {
        boolean result = false;
        if (conversion.equals("m-km") || conversion.equals("m-mi") || conversion.equals("km-m") ||
                conversion.equals("km-mi") || conversion.equals("mi-m") || conversion.equals("mi-km")) {
            result = true;
        }

        return result;
    }

    private static double roundToDecimalPlaces(double number, int decimalPlace) {
        number = Math.round(number * Math.pow(10, decimalPlace));
        return number / Math.pow(10, decimalPlace);
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers * 0.6213711922;
    }

    private static double milesToKilometers(double miles) {
        return miles * 1.609344;
    }

    public static boolean isANumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String formatDouble(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        return decimalFormat.format(number);
    }
}

