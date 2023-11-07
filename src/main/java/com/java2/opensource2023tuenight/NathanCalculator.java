package com.java2.opensource2023tuenight;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="nathanCalculator", value="/nathan-calculator")
public class NathanCalculator extends HttpServlet {
    private static Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("nathan-calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        results.clear();
        String initialDistance = req.getParameter("initialDistance");
        String conversionFrom = req.getParameter("conversionFrom");
        String conversionTo = req.getParameter("conversionTo");
        results.put("initialDistance", initialDistance);
        results.put("conversionFrom", conversionFrom);
        results.put("conversionTo", conversionTo);
        convertDistance(initialDistance, conversionFrom, conversionTo);
        System.out.println(results.get("distanceConverted"));
        req.setAttribute("results", results);
        req.getRequestDispatcher("nathan-calculator.jsp").forward(req, resp);
    }

    private void convertDistance(String distance, String from, String to){
        if(isANumber(distance)) {
            double distanceInMeters = convertToMeters(Double.parseDouble(distance), from);
            double distanceConverted = convertFromMeters(distanceInMeters, to);
            results.put("distanceConverted", Double.toString(distanceConverted));
        }
    }

    private double convertFromMeters(double length, String to) {
        double result = 0.0;
        switch(to){
            case "toMm":
                result = length * 1000;
                break;
            case "toCm":
                result = length * 100;
                break;
            case "toKm":
                result = length / 1000;
                break;
            case "toIn":
                result = length * 39.37;
                break;
            case "toFt":
                result = length * 3.28;
                break;
            case "toYd":
                result = length * 1.094;
                break;
            case "toMi":
                result = length / 1609.34;
                break;
            case "toM":
                result = length;
                break;
            default:
                results.put("typeError", "Please input a valid type");
                break;
        }
        return result;
    }

    private boolean isANumber(String num){
        try {
            Double.parseDouble(num);
            return true;
        } catch(NumberFormatException e) {
            results.put("invalidNumber", "Please input a valid number");
            return false;
        }
    }

    private double convertToMeters(double length, String type){
        double result = 0.0;

        switch(type){
            case "fromMm":
                result = length / 1000;
                break;
            case "fromCm":
                result = length / 100;
                break;
            case "fromKm":
                result = length * 1000;
                break;
            case "fromIn":
                result = length / 39.37;
                break;
            case "fromFt":
                result = length / 3.28;
                break;
            case "fromYd":
                result = length / 1.094;
                break;
            case "fromMi":
                result = length * 1609.34;
                break;
            case "fromM":
                result = length;
                break;
            default:
                results.put("typeError", "Please input a valid type");
                break;
        }
        return result;
    }
}
