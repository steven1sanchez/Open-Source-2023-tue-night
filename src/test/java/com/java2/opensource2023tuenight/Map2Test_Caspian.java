package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class Map2Test_Caspian {

    @Test
    public void wordLen_caspian(){

        //wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        String[] list1 = new String[4];
        list1[0] = "a";
        list1[1] = "bb";
        list1[2] = "a";
        list1[3] = "bb";
        Map<String, Integer> map1 = Map2.wordLen_caspian(list1);
        Map<String, Integer> map1a = new HashMap<>();
        map1a.put("bb", 2);
        map1a.put("a", 1);
        assertEquals(map1, map1a);

        //wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}

        String[] list2 = new String[4];
        list2[0] = "this";
        list2[1] = "and";
        list2[2] = "that";
        list2[3] = "and";
        Map<String, Integer> map2 = Map2.wordLen_caspian(list2);
        Map<String, Integer> map2a = new HashMap<>();
        map2a.put("that", 4);
        map2a.put("and", 3);
        map2a.put("this", 4);
        assertEquals(map2, map2a);

        //wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}

        String[] list3 = new String[4];
        list3[0] = "code";
        list3[1] = "code";
        list3[2] = "code";
        list3[3] = "bug";
        Map<String, Integer> map3 = Map2.wordLen_caspian(list3);
        Map<String, Integer> map3a = new HashMap<>();
        map3a.put("code", 4);
        map3a.put("bug", 3);
        assertEquals(map3, map3a);

        //wordLen([]) → {}

        String[] list4 = new String[0];
        Map<String, Integer> map4 = Map2.wordLen_caspian(list4);
        Map<String, Integer> map4a = new HashMap<>();
        assertEquals(map4, map4a);

        //wordLen(["z"]) → {"z": 1}

        String[] list5 = new String[1];
        list5[0] = "z";
        Map<String, Integer> map5 = Map2.wordLen_caspian(list5);
        Map<String, Integer> map5a = new HashMap<>();
        map5a.put("z", 1);
        assertEquals(map5, map5a);

    }
}
