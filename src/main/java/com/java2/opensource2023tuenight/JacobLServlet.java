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

    private void convertSeconds(String conversion, String numConvert){
        // Validate if number
        if (!isANumber(numConvert)){
            results.put("secondsError", "Please enter a valid input for Seconds");
        }

        // Null Conversion
        if(conversion == null || conversion.equals("Select Conversion") || conversion.equals("")){
            results.put("conversionError", "Please select a valid conversion");
        }

        if (!results.containsKey("conversionError") && !results.containsKey("secondsError")){
            if (conversion.equals("secToMin")){
                double minutes = Double.parseDouble(numConvert) / 60;
                results.put("secConverted", String.format("%s seconds is %s minutes.", numConvert, minutes));
            }
            if (conversion.equals("secToHour")){
                double hours = Double.parseDouble(numConvert) / 3600;
                results.put("secConverted", String.format("%s seconds is %s hours.", numConvert, hours));
            }
            if (conversion.equals("secToDay")){
                double days = Double.parseDouble(numConvert) / 86400;
                results.put("secConverted", String.format("%s seconds is %s days.", numConvert, days));
            }
            if (conversion.equals("minToSec")){
                double minutes = Double.parseDouble(numConvert) * 60;
                results.put("secConverted", String.format("%s minute(s) is %s seconds.", numConvert, minutes));
            }
            if (conversion.equals("hourToSec")){
                double hours = Double.parseDouble(numConvert) * 3600;
                results.put("secConverted", String.format("%s hour(s) is %s seconds.", numConvert, hours));
            }
            if (conversion.equals("dayToSec")){
                double days = Double.parseDouble(numConvert) * 86400;
                results.put("secConverted", String.format("%s day(s) is %s seconds.", numConvert, days));
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
