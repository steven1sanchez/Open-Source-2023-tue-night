package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Map1Test_Sagan {
    @Test
    void mapAB4_sagan() {
        //mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "aaa");
        map.put("b", "bb");
        map.put("c", "cake");
        Map<String, String> map2 = Map1.mapAB4_sagan(map);
        assertEquals("aaa", map2.get("a"));
        assertEquals("bb", map2.get("b"));
        assertEquals("aaa", map2.get("c"));
    }
}