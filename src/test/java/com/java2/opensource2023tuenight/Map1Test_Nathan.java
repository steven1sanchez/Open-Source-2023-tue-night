package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.java2.opensource2023tuenight.Map1.mapAB4_Nathan;
import static org.junit.jupiter.api.Assertions.*;


class Map1Test_Nathan {

    @Test
    void mapAB4Test1_Nathan() {
        // mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "aaa");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "aaa");
        expected.put("b", "bb");
        expected.put("c", "aaa");

        assertEquals(mapAB4_Nathan(map), expected);
    }

    @Test
    void mapAB4Test2_Nathan() {
        // mapAB4({"a": "", "b": "b", "c": "cake"}) → {"a": "", "b": "b", "c": "b"}
        Map<String, String> map = new HashMap<>();
        map.put("a", "");
        map.put("b", "b");
        map.put("c", "cake");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "");
        expected.put("b", "b");
        expected.put("c", "b");

        assertEquals(mapAB4_Nathan(map), expected);
    }
}