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
    public Map<String, String> firstChar_Andres(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings){
            String letter = Character.toString(str.charAt(0));
            if(!map.containsKey(letter)){
                map.put(letter, str);
            }
            else{
                String prev = map.get(letter);
                map.put(letter, prev + str);
            }
        }
        return map;
    }


}
