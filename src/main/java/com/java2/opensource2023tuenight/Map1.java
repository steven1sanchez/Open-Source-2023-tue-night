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

    public static Map<String, String> mapAB2_Jonathan_Beck(Map<String, String> map) {
        String aStuff = map.get("a");
        String bStuff = map.get("b");
        if (aStuff!=null && bStuff!=null && aStuff.equals(bStuff)){
            map.remove("a");
            map.remove("b");

        }
        return map;

    }







}
