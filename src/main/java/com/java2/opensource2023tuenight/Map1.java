package com.java2.opensource2023tuenight;

import java.util.Map;

public class Map1 {
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
}
