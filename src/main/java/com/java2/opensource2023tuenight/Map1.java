package com.java2.opensource2023tuenight;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapAB_marc(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
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

}
