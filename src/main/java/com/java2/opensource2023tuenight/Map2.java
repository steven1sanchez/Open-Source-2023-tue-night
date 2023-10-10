package com.java2.opensource2023tuenight;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    public static Map<String, Boolean> wordMultiple_marc(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for(String str: strings){
            if(!map.containsKey(str)){
                map.put(str, false);
            }
            else{
                map.put(str, true);
            }
        }
        return map;
    }

    public static String wordAppend_isabella(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for(String str: strings) {
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
                if(map.get(str) % 2 == 0) {
                    result = result.concat(str);
                }
            } else {
                map.put(str, 1);
            }
        }
        return result;
    }


}
