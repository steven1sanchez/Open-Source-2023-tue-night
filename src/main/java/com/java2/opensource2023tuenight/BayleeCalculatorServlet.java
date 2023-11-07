package com.java2.opensource2023tuenight;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="bayleeCalculator", value="/baylee-calculator")
public class BayleeCalculatorServlet extends HttpServlet {

    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/baylee-calculator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversionType = req.getParameter("conversionType");
        String amount = req.getParameter("amount");
        results.clear();
        results.put("conversionType", conversionType);
        results.put("amount", amount);
        convert(conversionType, amount);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/baylee-calculator.jsp").forward(req, resp);
    }

    private void convert(String conversionType, String amount) {
        if (conversionType == null ||
                (!conversionType.equals("InToFt")
                        && !conversionType.equals("FtToYd")
                        && !conversionType.equals("YdToIn")
                        && !conversionType.equals("InToYd")
                        && !conversionType.equals("FtToIn")
                        && !conversionType.equals("YdToFt"))) {
            results.put("conversionError", "Select a conversion type");
        }
        if (!isANumber(amount)){
            results.put("amountError", "Please enter a valid amount");
        }
        if (!results.containsKey("conversionError") && !results.containsKey("amountError")){
            if (conversionType.equals("InToFt")) {
                Double convertedAmount = Double.parseDouble(amount) / 12;
                results.put("convertedAmount", String.format("%s inches is %.4f feet.", amount, convertedAmount));
            } else if (conversionType.equals("InToYd")){
                Double convertedAmount = Double.parseDouble(amount) / 36;
                results.put("convertedAmount", String.format("%s inches is %.4f yards.", amount, convertedAmount));
            } else if (conversionType.equals("FtToYd")) {
                Double convertedAmount = Double.parseDouble(amount) / 3;
                results.put("convertedAmount", String.format("%s feet is %.4f yards.", amount, convertedAmount));
            } else if (conversionType.equals("FtToIn")) {
                Double convertedAmount = Double.parseDouble(amount) * 12;
                results.put("convertedAmount", String.format("%s feet is %.4f inches.", amount, convertedAmount));
            } else if (conversionType.equals("YdToIn")){
                Double convertedAmount = Double.parseDouble(amount) * 36;
                results.put("convertedAmount", String.format("%s yards is %.4f inches.", amount, convertedAmount));
            } else {
                Double convertedAmount = Double.parseDouble(amount) * 3;
                results.put("convertedAmount", String.format("%s yard is %.4f feet.", amount, convertedAmount));
            }
        }

    }

    private static boolean isANumber(String num){
        try {
            Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
