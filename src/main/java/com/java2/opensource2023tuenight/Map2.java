package com.java2.opensource2023tuenight;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, Integer> wordLen_caspian(String[] strings) {
        Map<String, Integer> stringCount = new HashMap<>();
        for (String add : strings) {
            int num = add.length();
            stringCount.put(add, num);
        }
        return stringCount;
    }
}
