package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Steven {

    @Test
    void topping3_steven() {
        //topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
        Map<String, String> map = new HashMap<>();
        map.put("potato", "butter");
        map.put("fries","butter");
        Map<String, String> map2 = Map1.topping3_steven(map);
        assertEquals("butter",map2.get("potato"));
        assertEquals("butter", map2.get("fries"));
        map.clear();
        map2.clear();
        //topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
        map.put("salad", "oil");
        map.put("spinach", "oil");
        map.put("potato", "ketchup");
        map.put("fries", "ketchup");
        assertEquals("oil", map2.get("spinach"));
        assertEquals("oil", map2.get("salad"));
        assertEquals("ketchup", map2.get("potato"));
        assertEquals("ketchup", map2.get("fries"));

    }
}