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

    public static Map<String, String> firstChar_Andres(String[] strings) {
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

    public static Map<String, String> pairs_jacobL(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings){
            map.put(str.substring(0, 1), str.substring(str.length()-1, str.length()));
        }

        return map;
    }

    public static String[] allSwap__Jonathan_Beck(String[] strings) {
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

    public static Map<String, Integer> wordLen_caspian(String[] strings) {
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

    public static String[] firstSwap_nathan(String[] strings) {
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

    public static String[] firstSwap_jaredHutton(String[] strings) {
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

    public static Map<String, String> firstChar_Nik(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s:strings) {
            String first = String.valueOf(s.charAt(0));

            //If this is the first time the letter is found in the list, add it.
            if (map.get(first) == null) { map.put(first, ""); }
            map.put(first, map.get(first) + s);
        }

        return map;
    }

    public static Map<String, Integer> wordLen_jaredR(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings){
            map.put(str, str.length());
        }
         return map;
    }     
      
    public static Map<String, String> firstChar_oleksiy(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String chara;
        for(String string : strings){
            chara = string.substring(0, 1);
            if(!map.containsKey(chara)){
                map.put(chara, string);
            }
            else{
                map.put(chara, map.get(chara) + string);
            }
        }

        return map;
    }
          
    public static Map<String, Integer> word0_mads(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < strings.length; i++)
        {
            map.put(strings[i], 0);
        }
        return map;
    }

    public static Map<String, Boolean> wordMultiple_sagan(String[] strings) {
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
