package com.java2.opensource2023tuenight;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
            double distanceD = Double.parseDouble(distance);
            switch (conversion) {
                case "m-km":
                    results.put("distanceConverted", String.format("%s meters is %s kilometers", distanceD,
                            distanceD * 1000));
                    break;
                case "m-mi":
                    results.put("distanceConverted", String.format("%s meters is %s miles", distanceD,
                            kilometersToMiles(distanceD * 1000)));
                    break;
                case "km-m":
                    results.put("distanceConverted", String.format("%s kilometers is %s meters", distanceD,
                            (distanceD / 1000)));
                    break;
                case "km-mi":
                    results.put("distanceConverted", String.format("%s kilometers is %s miles", distanceD,
                            kilometersToMiles(distanceD)));
                    break;
                case "mi-m":
                    results.put("distanceConverted", String.format("%s miles is %s meters", distanceD,
                            (milesToKilometers(distanceD) / 1000)));
                    break;
                case "mi-km":
                    results.put("distanceConverted", String.format("%s miles is %s kilometers", distanceD,
                            milesToKilometers(distanceD)));
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
}

