package com.java2.opensource2023tuenight;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "kirstensCalculator", value = "/kirstens-calculator")
public class KirstensCalculator extends HttpServlet {
    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/kirstens-calculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String conversion = request.getParameter("conversion");
        String measurement = request.getParameter("measurement");
        results.clear();
        results.put("conversion", conversion);
        results.put("measurement", measurement);
        convertMeasurement(conversion, measurement);
        request.setAttribute("results", results);
        request.getRequestDispatcher("WEB-INF/kirstens-calculator.jsp").forward(request, response);
    }

    private void convertMeasurement(String conversion, String measurement) {
        if(conversion == null || (!conversion.equals("inches2feet") && !conversion.equals("inches2yards")
                && !conversion.equals("feet2inches") && !conversion.equals("feet2yards")
                && !conversion.equals("yards2inches") && !conversion.equals("yards2feet"))) {
            results.put("conversionError", "Select a conversion type");
        }
        if(!isANumber(measurement)) {
            results.put("measurementError", "Please input a valid measurement");
        }
        if(!results.containsKey("conversionError") && !results.containsKey("measurementError")) {
            double measurementD = Double.parseDouble(measurement);
            if(conversion.equals("inches2feet")) {
                double convertedMeasurement = measurementD / 12.0;
                results.put("measurementConverted", String.format("%s inches is %s feet", measurementD, convertedMeasurement));
            }
            if(conversion.equals("inches2yards")) {
                double convertedMeasurement = measurementD / 36.0;
                results.put("measurementConverted", String.format("%s inches is %s yards", measurementD, convertedMeasurement));
            }
            if(conversion.equals("feet2inches")) {
                double convertedMeasurement = measurementD * 12.0;
                results.put("measurementConverted", String.format("%s feet is %s inches", measurementD, convertedMeasurement));
            }
            if(conversion.equals("feet2yards")) {
                double convertedMeasurement = measurementD / 3.0;
                results.put("measurementConverted", String.format("%s feet is %s yards", measurementD, convertedMeasurement));
            }
            if(conversion.equals("yards2inches")) {
                double convertedMeasurement = measurementD * 36.0;
                results.put("measurementConverted", String.format("%s yards is %s inches", measurementD, convertedMeasurement));
            }
            if(conversion.equals("yards2feet")) {
                double convertedMeasurement = measurementD * 3.0;
                results.put("measurementConverted", String.format("%s yards is %s feet", measurementD, convertedMeasurement));
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