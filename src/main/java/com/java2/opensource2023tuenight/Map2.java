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
    public static Map<String, Integer> wordLen_alina(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings) {
            if(map.containsKey(str)){
                map.put(str, str.length());
            }
            else {
                map.put(str, str.length());
            }
        }
        return map;
    }


}
