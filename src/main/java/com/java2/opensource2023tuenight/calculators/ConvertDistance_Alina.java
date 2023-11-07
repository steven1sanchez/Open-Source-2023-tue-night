package com.java2.opensource2023tuenight.calculators;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "convertDistance_Alina", value = "/alina-convert-distance")
public class ConvertDistance_Alina extends HttpServlet {
    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/alina-distance-converter.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversionFrom = req.getParameter("conversionFrom");
        String conversionTo = req.getParameter("conversionTo");
        String distance = req.getParameter("distance");
        results.clear();
        results.put("conversionFrom", conversionFrom);
        results.put("conversionTo", conversionTo);
        results.put("distance", distance);
        convertDistance(conversionFrom, conversionTo, distance);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/alina-distance-converter.jsp").forward(req, resp);
    }

    private void convertDistance(String conversionFrom, String conversionTo, String distance) {
        if (conversionFrom.equals("none") || conversionTo.equals("none")) {
            results.put("conversionError", "Select a conversion type");
        }
        if (!isANumber(distance)) {
            results.put("distanceError", "Please input a valid distance");
        }
        if (!results.containsKey("conversionError") && !results.containsKey("distanceError")) {
            double distanceD = Double.parseDouble(distance);
            if (conversionFrom.equals("m") && conversionTo.equals("mi")) {
                double convertedDistance = distanceD * 0.000621;
                results.put("distanceConverted", String.format("%s meters is %s miles", distanceD, convertedDistance));
            }
            if (conversionFrom.equals("mi") && conversionTo.equals("m")) {
                double convertedDistance = distanceD * 1609.34;
                results.put("distanceConverted", String.format("%s miles is %s meters", distanceD, convertedDistance));
            }
            if (conversionFrom.equals("m") && conversionTo.equals("km")) {
                double convertedDistance = distanceD / 1000;
                results.put("distanceConverted", String.format("%s meters is %s kilometers", distanceD, convertedDistance));
            }
            if (conversionFrom.equals("km") && conversionTo.equals("m")) {
                double convertedDistance = distanceD * 1000;
                results.put("distanceConverted", String.format("%s kilometers is %s meters", distanceD, convertedDistance));
            }
            if (conversionFrom.equals("mi") && conversionTo.equals("km")) {
                double convertedDistance = distanceD * 1.60934;
                results.put("distanceConverted", String.format("%s miles is %s kilometers", distanceD, convertedDistance));
            }
            if (conversionFrom.equals("km") && conversionTo.equals("mi")) {
                double convertedDistance = distanceD / 1.60934;
                results.put("distanceConverted", String.format("%s kilometers is %s miles", distanceD, convertedDistance));
            }
            // same unit conversions:
            if (conversionFrom.equals("m") && conversionTo.equals("m")) {
                results.put("distanceConverted", String.format("%s meters is %s meters", distanceD, distanceD));
            }
            if (conversionFrom.equals("mi") && conversionTo.equals("mi")) {
                results.put("distanceConverted", String.format("%s miles is %s miles", distanceD, distanceD));
            }
            if (conversionFrom.equals("km") && conversionTo.equals("km")) {
                results.put("distanceConverted", String.format("%s kilometers is %s kilometers", distanceD, distanceD));
            }
        }
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