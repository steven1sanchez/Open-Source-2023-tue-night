package com.java2.opensource2023tuenight;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@WebServlet(name="liquidConverter", urlPatterns = {"/convert-liquids-caspian", "/convert-liquid-caspian"})
public class LiquidConverterServlet extends HttpServlet {

    private static Map<String, String> results = new HashMap<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/liquid-converter.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String conversion = req.getParameter("liquidType");
        String liquid = req.getParameter("liquid");
        results.clear();
        results.put("conversion", conversion);
        results.put("liquid", liquid);
        liquidConverter(conversion, liquid);
        req.setAttribute("results", results);
        req.getRequestDispatcher("WEB-INF/liquid-converter.jsp").forward(req, resp);
    }

    private void liquidConverter(String conversion, String liquid){
        if(conversion == null || (!conversion.equals("Gallon") && !conversion.equals("Cup") && !conversion.equals("Ounce"))) {
            results.put("conversionError", "Select a conversion type");
        }
        if (!isANumber(liquid)) {
            results.put("liquidError", "Please input a valid liquid");
        }
        if(!results.containsKey("conversionError") && !results.containsKey("liquidError")){
            double liquidDouble = Double.parseDouble(liquid);
                if (conversion.equals("Gallon")) {
                    double gallonToCup = (liquidDouble * 16.0);
                    double gallonToFluidOunce = (liquidDouble * 128.0);
                    results.put("liquidConverted", String.format("%s in cups is %.2f,and %s in fluid ounces is %.2f.", liquidDouble, gallonToCup, liquidDouble, gallonToFluidOunce));
                }
                if (conversion.equals("Cup")) {
                    double CupToGallon = (liquidDouble / 16.0);
                    double CupToFluidOunce = (liquidDouble * 8.0);
                    results.put("liquidConverted", String.format("%s in gallons is %.2f,and %s in fluid ounces is %.2f.", liquidDouble, CupToGallon, liquidDouble, CupToFluidOunce));
                }
                if (conversion.equals("Ounce")) {
                    double FluidOunceToGallon = (liquidDouble / 128.0);
                    double FluidOunceToCup = (liquidDouble / 8.0);
                    results.put("liquidConverted", String.format("%s in gallons is %.2f,and %s in cups is %.2f.", liquidDouble, FluidOunceToGallon, liquidDouble, FluidOunceToCup));
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
