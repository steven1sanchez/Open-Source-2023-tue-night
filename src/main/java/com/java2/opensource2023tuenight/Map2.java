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

    public String[] firstSwap_jaredHutton(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();

        for (int ix = 0; ix < strings.length; ++ix) {
            String str = strings[ix];
            if (str.length() > 0) {
                char key = str.charAt(0);
                if (map.containsKey(key)) {
                    if (map.get(key) != -1) {
                        int oldIx = map.get(key);
                        strings[ix] = strings[oldIx];
                        strings[oldIx] = str;
                        map.put(key, -1);
                    }
                } else {
                    map.put(key, ix);
                }
            }
        }

        return strings;
    }

}
