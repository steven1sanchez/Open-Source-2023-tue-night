package com.java2.opensource2023tuenight;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String[] outStrings = new String[strings.length];
        for(int i = 0; i < strings.length; i++){
        String str = strings[i];
            if(!str.isEmpty() && map.keySet().contains(str.substring(0, 1)) &&
                    map.get(str.substring(0, 1)) > -1){
                outStrings[i] = strings[map.get(str.substring(0, 1))];
                outStrings[map.get(str.substring(0, 1))] = str;
                map.put(str.substring(0, 1), -1);
            } else {
                outStrings[i] = str;
                if(!map.keySet().contains(str.substring(0, 1))){
                    map.put(str.substring(0, 1), i);
                }
            }
        }
    return outStrings;
    }
}
