package com.java2.opensource2023tuenight;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="distanceServlet", urlPatterns ={"/distance", "/distances"})
public class DistanceServlet_StevenS extends HttpServlet {
    Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/distance.jsp").forward(req, resp);
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
        req.getRequestDispatcher("WEB-INF/distance.jsp").forward(req, resp);
    }
    private void convertDistance(String conversion, String distance) {
        if (conversion == null || !conversion.equals("MeToMi") && !conversion.equals("MiToKi") && !conversion.equals("KiToMe")) {
            results.put("conversionError", "Select a conversion type");
        }
        if (!isANumber(distance)) {
            results.put("distanceError", "Please input a valid distance");
        }
        if (!results.containsKey("conversionError") && !results.containsKey("distanceError")) {
            double distanceD = Double.parseDouble(distance);
            if (conversion.equals("MeToMi")) {
                double convertedDist = distanceD * 0.000621371; // Meters to Miles
                results.put("distConverted", String.format("%s meters is %.9f miles", distanceD, convertedDist));
            } else if (conversion.equals("MiToKi")) {
                double convertedDist = distanceD * 1.60934; // Miles to Kilometers
                results.put("distConverted", String.format("%s miles is %s kilometers", distanceD, convertedDist));
            } else if (conversion.equals("KiToMe")) {
                double convertedDist = distanceD * 1000; // Kilometers to Meters
                results.put("distConverted", String.format("%s kilometers is %s meters", distanceD, convertedDist));
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
