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

}