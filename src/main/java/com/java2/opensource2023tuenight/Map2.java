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

    public String[] allSwap__Jonathan_Beck(String[] strings) {
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String key_char = String.valueOf(strings[i].charAt(0));

            if (map2.containsKey(key_char)) {

                Integer index_to_swap = map2.get(key_char);
                String temp = strings[index_to_swap];
                strings[index_to_swap]= strings[i];
                strings[i]=temp;

                map2.remove(key_char);

            }
            else {
                map2.put(key_char,i);
            }
        }

        return strings;
    }

}
