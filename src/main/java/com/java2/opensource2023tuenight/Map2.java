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

    public static String[] firstSwap_baylee(String[] strings) {
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> location = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        for (int i = 0; i < strings.length; i++){
            String ch = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(ch)){
                count.put(ch, count.get(ch) + 1);
                if (count.get(ch) == 2){
                    String hold = map.get(ch);
                    strings[location.get(ch)] = strings[i];
                    strings[i] = hold;
                }
            } else {
                map.put(ch, strings[i]);
                location.put(ch, i);
                count.put(ch, 1);
            }
        }
        return strings;
    }

}
