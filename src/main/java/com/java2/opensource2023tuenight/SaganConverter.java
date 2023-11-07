package com.java2.opensource2023tuenight;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.floor;

@WebServlet(name="saganConverter", urlPatterns = {"/sagan-converter"})
public class SaganConverter extends HttpServlet {
    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/sagan-converter.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String inputUnit = req.getParameter("inputUnit");
        String inputNum = req.getParameter("inputNum");
        String outputUnit = req.getParameter("outputUnit");

        results.clear();
        results.put("inputUnit", inputUnit);
        results.put("inputNum", inputNum);
        results.put("outputUnit", outputUnit);

        String outputNumber = convert(inputUnit, inputNum, outputUnit);
        if(!outputNumber.isEmpty()) {
            results.put("outputNum", outputNumber);
        }
        else {
            results.put("error", "Please enter an option for all inputs.");
        }

        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/sagan-converter.jsp").forward(req, resp);
    }

    private String convert(String inputUnit, String inputNum, String outputUnit) {
        if(inputUnit.equals("") || inputNum.equals("") || outputUnit.equals("")) {
            return "";
        }

        String output = "";

        switch(inputUnit) {
            case "Meter":
                switch(outputUnit) {
                    case "Meter":
                        output = inputNum;
                        break;
                    case "Mile":
                        output = String.valueOf(Double.parseDouble(inputNum) / 1609.344);
                        break;
                    case "Kilometer":
                        output = String.valueOf(Double.parseDouble(inputNum) / 1000);
                        break;
                }
                break;
            case "Mile":
                switch(outputUnit) {
                    case "Meter":
                        output = String.valueOf(Double.parseDouble(inputNum) * 1609.34);
                        break;
                    case "Mile":
                        output = inputNum;
                        break;
                    case "Kilometer":
                        output = String.valueOf(Double.parseDouble(inputNum) * 1.609344);
                        break;
                }
                break;
            case "Kilometer":
                switch(outputUnit) {
                    case "Meter":
                        output = String.valueOf(Double.parseDouble(inputNum) * 1000);
                        break;
                    case "Mile":
                        output = String.valueOf(Double.parseDouble(inputNum) * 0.621371);
                        break;
                    case "Kilometer":
                        output = inputNum;
                        break;
                }
                break;
        }

        Double outputNum = Double.parseDouble(output);

        if(floor(outputNum) == outputNum) {
            output = String.valueOf(outputNum.intValue()); //Smooth out the number by removing the redundant decimal point.
        }
        output = output + " " + outputUnit; //Add the output unit.
        if(outputNum != 1.0) {
            output = output + "s"; //Add an "s" if the output unit isn't singular.
        }

        output = output + "."; //Add a period at the end.

        return output;
    }
}
