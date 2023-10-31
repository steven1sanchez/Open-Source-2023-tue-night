package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Kirsten {

    @Test
    void topping3_kirsten() {
        // topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
        Map<String, String> map = new HashMap<>();
        map.put("potato", "butter");
        Map<String, String> map2 = Map1.topping3_kirsten(map);
        assertEquals("butter", map2.get("potato"));
        assertEquals("butter", map2.get("fries"));

        // topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
        map.clear();
        map2.clear();
        map.put("salad", "oil");
        map.put("potato", "ketchup");
        map2 = Map1.topping3_kirsten(map);
        assertEquals("oil", map2.get("spinach"));
        assertEquals("oil", map2.get("salad"));
        assertEquals("ketchup", map2.get("potato"));
        assertEquals("ketchup", map2.get("fries"));
    }
}