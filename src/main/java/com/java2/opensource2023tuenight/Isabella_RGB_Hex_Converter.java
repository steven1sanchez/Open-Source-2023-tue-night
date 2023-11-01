package com.java2.opensource2023tuenight;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "isabellaRgbHexConvert", value="/isabella-rgb-hex")
public class Isabella_RGB_Hex_Converter extends HttpServlet {

    private static Map<String, String> results = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("isabella-rgb-hex.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversion = req.getParameter("conversion");  // matches with the name= on select menu
        String txtHex = req.getParameter("txtHex");
        String colorValueR = req.getParameter("colorValueR");
        String colorValueG = req.getParameter("colorValueG");
        String colorValueB = req.getParameter("colorValueB");
        results.clear();
        results.put("conversion", conversion);
        if (conversion == null || (!conversion.equals("rgb")) && (!conversion.equals("hex"))){
            results.put("conversionError", "Select a conversion type.");
        }
        else if(conversion.equals("rgb")){
            convertRGB(colorValueR, colorValueG, colorValueB);
        }
        else if(conversion.equals("hex")){
            convertHex(txtHex);
        }
        req.setAttribute("results", results);
        req.getRequestDispatcher("isabella-rgb-hex.jsp").forward(req, resp);
    }

    private void convertRGB (String colorValueR, String colorValueG, String colorValueB) {
        int colorR = Integer.parseInt(colorValueR);
        int colorG = Integer.parseInt(colorValueG);
        int colorB = Integer.parseInt(colorValueB);
        String hexStr = "#";
        if(!isARGB(colorR) || !isARGB(colorG) || !isARGB(colorB)){
            results.put("RGBError", "Please input a valid RGB value between 0 and 255");
        } else {
            hexStr += Integer.toHexString(colorR);
            hexStr += Integer.toHexString(colorG);
            hexStr += Integer.toHexString(colorB);
            results.put("RGBConverted", hexStr);
        }
    }

    private void convertHex (String hex) {
        boolean validate = isAHex(hex);
        int redVal;
        int greenVal;
        int blueVal;
        String rgbVal;

        if(validate == false){
            results.put("hexError", "Please input a valid hexadecimal value");
        } else {
            redVal = Integer.valueOf(hex.substring(1, 3), 16);
            greenVal = Integer.valueOf(hex.substring(3, 5), 16);
            blueVal = Integer.valueOf(hex.substring(5, 7), 16);
            rgbVal = "(" + redVal + ", " + greenVal + ", " + blueVal + ")";
            results.put("hexConverted", rgbVal);
        }
    }

    public static boolean isAHex(String str) {
        try {
            return str.matches("#[0-9A-Fa-f]{6}");
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isARGB(int num) {
        if(num <= 255 && num >= 0){
            return true;
        } else {
            return false;
        }
    }
}
