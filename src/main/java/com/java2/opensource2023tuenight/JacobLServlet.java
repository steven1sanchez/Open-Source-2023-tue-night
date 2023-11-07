package com.java2.opensource2023tuenight;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="jacobLServlet", value="/jlCalc")
public class JacobLServlet extends HttpServlet {
    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("WEB-INF/jacobLCalculator.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversion = req.getParameter("secConvert");
        String seconds = req.getParameter("seconds");
        // Clear results
        results.clear();
        results.put("conversion", conversion);
        results.put("seconds", seconds);
        convertSeconds(conversion, seconds);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/jacobLCalculator.jsp").forward(req, resp);
    }

    private void convertSeconds(String conversion, String seconds){
        // Validate if number
        if (!isANumber(seconds)){
            results.put("secondsError", "Please enter a valid input for Seconds");
        }

        // Null Conversion
        if(conversion == null || conversion.equals("Select Conversion") || conversion.equals("")){
            results.put("conversionError", "Please select a valid conversion");
        }

        if (!results.containsKey("conversionError") && !results.containsKey("secondsError")){
            if (conversion.equals("min")){
                double minutes = Double.parseDouble(seconds) / 60;
                results.put("secConverted", String.format("%s seconds is %s minutes.", seconds, minutes));
            }
            if (conversion.equals("hour")){
                double hours = Double.parseDouble(seconds) / 3600;
                results.put("secConverted", String.format("%s seconds is %s hours.", seconds, hours));
            }
            if (conversion.equals("day")){
                double days = Double.parseDouble(seconds) / 86400;
                results.put("secConverted", String.format("%s seconds is %s days.", seconds, days));
            }
            results.put("secConvert", conversion);
        }
    }

    public static boolean isANumber(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
