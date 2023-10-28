package com.java2.opensource2023tuenight;
import java.util.HashMap;
import java.util.Map;
public class WordMultiple_JacobW {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map2 = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings) {
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        map.forEach((str, num) -> {
            if(num >= 2) {
                map2.put(str, true);
            } else {
                map2.put(str, false);
            }
        });
        return map2;
    }
}
