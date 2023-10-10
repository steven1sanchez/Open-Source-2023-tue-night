package com.java2.opensource2023tuenight;

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
}
