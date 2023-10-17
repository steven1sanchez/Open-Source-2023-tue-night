package com.java2.opensource2023tuenight;

import java.util.Map;

public class Map1 {
    public static Map<String, String> mapAB2_caspian(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if(map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
