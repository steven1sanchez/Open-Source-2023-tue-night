package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_andres {

    @Test
    void mapAB3_andres() {
        //mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
        Map<String, String> map = new HashMap<>();
        map.put("a","aaa");
        map.put("c", "cake");
        Map<String, String> map2 = Map1.mapAB3_andres(map);
        assertEquals("aaa",map2.get("a"));
        assertEquals("cake",map2.get("c"));
        assertEquals("aaa",map2.get("b"));
        map.clear();
        map2.clear();
    }

}