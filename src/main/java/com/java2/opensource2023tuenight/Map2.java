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

    public Map<String, Integer> wordLen_caspian(String[] strings) {
        Map<String, Integer> stringCount = new HashMap<>();
        for (String add : strings) {
            int num = add.length();
            stringCount.put(add, num);
        }
        return stringCount;
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

    public static String[] allSwap_kirsten(String[] strings) {
        String[] result = new String[strings.length];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c)) {
                int p = map.get(c);
                map.remove(c);
                result[i] = result[p];
                result[p] = strings[i];
            } else {
                result[i] = strings[i];
                map.put(c, i);
            }
        }
        return result;
    }

}