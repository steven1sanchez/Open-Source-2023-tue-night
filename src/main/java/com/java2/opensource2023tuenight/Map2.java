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
    public  static String[] allSwap_steven(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            char firstChar = str.charAt(0);
            if (map.containsKey(firstChar)) {
                int swapIndex = map.get(firstChar);
                String temp = strings[i] ;
                strings[i] = strings[swapIndex];
                strings[swapIndex] = temp;
                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }
}
