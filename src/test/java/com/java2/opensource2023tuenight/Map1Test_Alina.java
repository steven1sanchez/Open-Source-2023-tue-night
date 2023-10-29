package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Alina {

    @Test
    void topping3_alina() {
        // topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
        Map<String, String> map = new HashMap<>();
        map.put("potato", "butter");
        Map<String, String> map2 = Map1.topping3_alina(map);
        assertEquals("butter", map.get("potato"));
        assertEquals("butter", map.get("fries"));
        map.clear();
        map2.clear();

        // topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
        map.put("salad", "oil");
        map.put("potato", "ketchup");
        Map1.topping3_alina(map);
        assertEquals("oil", map.get("spinach"));
        assertEquals("oil", map.get("salad"));
        assertEquals("ketchup", map.get("potato"));
        assertEquals("ketchup", map.get("fries"));
    }
}