package com.java2.opensource2023tuenight;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapAB_marc(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, String> mapAB2_caspian(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
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

    public static Map<String, String> topping3_alina(Map<String, String> map) {
        if(map.get("potato") != null && !map.get("potato").equals("")){
            map.put("fries", map.get("potato"));
        }
        if(map.get("salad") != null && !map.get("salad").equals("")){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

}
