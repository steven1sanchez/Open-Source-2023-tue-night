package com.java2.opensource2023tuenight;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

    public static Map<String, String> mapAB_marc(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static Map<String, String> mapAB4_baylee(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()){
                map.put("a", "");
                map.put("b", "");
            } else if (map.get("a").length() >= map.get("b").length()) {
                map.put("c", map.get("a"));
            } else{
                map.put("c", map.get("b"));
            }
        }
        return map;
    }              
              
  public static Map<String, String> mapAB3_andres(Map<String, String> map){
        if(map.containsKey("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        }
        if(map.containsKey("b") && !map.containsKey("a")){
            map.put("a", map.get("b"));
        }
        return map;
    }
  
    public static Map<String, String> topping3_steven(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries" , map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static Map<String, String> mapAB2_caspian(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static Map<String, String> mapAB4_Nathan(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").length() == map.get("b").length()){
                map.put("a", "");
                map.put("b", "");
            } else {
                map.put("c", map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b"));
            }
        }
        return map;
    }

    public static Map<String, String> topping3_isabella(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static Map<String, String> topping3_alina(Map<String, String> map) {
        if(map.get("potato") != null && !map.get("potato").equals("")){
            map.put("fries", map.get("potato"));
        }
        if(map.get("salad") != null && !map.get("salad").equals("")){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static Map<String, String> topping3_kirsten(Map<String, String> map) {
        if(map.containsKey("potato")) {
            String p = map.get("potato");
            map.put("fries", p);
        }
        if(map.containsKey("salad")) {
            String s = map.get("salad");
            map.put("spinach", s);
        }
        return map;
    }

    public static Map<String, String> mapAB2_Jonathan_Beck(Map<String, String> map) {
        String aStuff = map.get("a");
        String bStuff = map.get("b");
        if (aStuff!=null && bStuff!=null && aStuff.equals(bStuff)){
            map.remove("a");
            map.remove("b");

        }
        return map;

    }

    public static Map<String, String> topping3_jaredHutton(Map<String, String> map) {
        Map outMap = new HashMap<String, String>();

        if (map.containsKey("potato")) {
            outMap.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            outMap.put("spinach", map.get("salad"));
        }

        return map;
    }

    public static Map<String, String> topping2_jacobL(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
        return map;
    }


    public static Map<String, String> mapShare_Nik(Map<String, String> map) {
        map.remove("c");

        if (map.get("a") != null && !map.get("a").equals(""))
        {
            map.put("b", map.get("a"));
        }
        return map;
    }
          
          

    public static Map<String, String> topping2_jaredR(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }
          return map;
    }    
      
    public static Map<String, String> topping1_oleksiy(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }


    public static Map<String, String> topping1_mads(Map<String, String> map) {

        if(map.containsKey("ice cream"))
        {
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");

        return map;
    }

    public static Map<String, String> mapAB4_sagan(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if(a == null || b == null) {
            return map;
        }

        int difference = a.length() - b.length();
        if(difference > 0) {
            map.put("c", a);
        } else if(difference < 0) {
            map.put("c", b);
        } else {
            map.put("a", "");
            map.put("b", "");
        }
        return map;
    }

}
