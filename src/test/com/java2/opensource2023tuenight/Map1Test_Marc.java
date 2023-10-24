package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Marc {

    @Test
    void mapAB_marc() {
        // mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "There");
        Map<String, String> map2 = Map1.mapAB_marc(map);
        assertEquals("Hi", map2.get("a"));
        assertEquals("HiThere", map2.get("ab"));
        assertEquals("There", map2.get("b"));
        map.clear();
        map2.clear();
        // Call more assert methods here

    }
}