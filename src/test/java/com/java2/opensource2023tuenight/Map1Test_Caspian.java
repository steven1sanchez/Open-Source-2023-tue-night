package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Map1Test_Caspian {

    @Test
    public void mapAB2_caspian(){

        //mapAB2({"a": "aaa"}) → {"a": "aaa"}
        Map<String, String> map0 = new HashMap<>();
        map0.put("a", "aaa");
        Map<String, String> map0a = Map1.mapAB2_caspian(map0);
        Map<String,String> map0b = new HashMap<>();
        map0b.put("a", "aaa");
        assertEquals(map0a, map0b);

        //mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a","aaa");
        map1.put("b","bbb");
        Map<String, String> map1a = Map1.mapAB2_caspian(map1);
        Map<String,String> map1b = new HashMap<>();
        map1b.put("a","aaa");
        map1b.put("b","bbb");
        assertEquals(map1a, map1b);

        //mapAB2({"a": "", "b": "", "c": "ccc"}) → {"c": "ccc"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("a","");
        map2.put("b","");
        map2.put("c","ccc");
        Map<String, String> map2a = Map1.mapAB2_caspian(map2);
        Map<String,String> map2b = new HashMap<>();
        map2b.put("c","ccc");
        assertEquals(map2a, map2b);

        //mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("a","aaa");
        map3.put("b","bbb");
        map3.put("c","aaa");
        Map<String, String> map3a = Map1.mapAB2_caspian(map3);
        Map<String,String> map3b = new HashMap<>();
        map3b.put("a","aaa");
        map3b.put("b","bbb");
        map3b.put("c","aaa");
        assertEquals(map3a, map3b);







    }
}
