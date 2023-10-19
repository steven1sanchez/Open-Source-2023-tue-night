package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Baylee {

    @Test
    public void mapAB4_baylee() {
//        mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
        Map<String, String> mapA = new HashMap<>();
        mapA.put("a", "aa");
        mapA.put("b", "bbb");
        mapA.put("c", "cake");
        Map<String, String> mapB = Map1.mapAB4_baylee(mapA);
        assertEquals("aa", mapB.get("a"));
        assertEquals("bbb", mapB.get("b"));
        assertEquals("bbb", mapB.get("c"));

        mapA.clear();
        mapB.clear();

//        mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
        mapA.put("a", "aaa");
        mapA.put("b", "bb");
        mapA.put("c", "cake");
        mapB = Map1.mapAB4_baylee(mapA);
        assertEquals("aaa", mapB.get("a"));
        assertEquals("bb", mapB.get("b"));
        assertEquals("aaa", mapB.get("c"));

        mapA.clear();
        mapB.clear();
    }
}