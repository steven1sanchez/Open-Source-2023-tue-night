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

    public Map<String, String> pairs_jacobL(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings){
            map.put(str.substring(0, 1), str.substring(str.length()-1, str.length()));
        }

        return map;
    }

}
