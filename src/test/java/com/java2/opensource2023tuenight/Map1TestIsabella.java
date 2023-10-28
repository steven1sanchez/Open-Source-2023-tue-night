package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Map1TestIsabella {

    @Test
    void topping3_isabella() {
        //topping3({"salad": "oil", "potato": "ketchup"}) →
        // {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
        Map<String, String> expectedMap1 = new HashMap<>();
        expectedMap1.put("spinach", "oil");
        expectedMap1.put("salad", "oil");
        expectedMap1.put("potato", "ketchup");
        expectedMap1.put("fries", "ketchup");
        Map<String, String> inputMap1 = new HashMap<>();
        inputMap1.put("salad", "oil");
        inputMap1.put("potato", "ketchup");
        Map<String, String> actualMap1 = new HashMap<>();
        actualMap1 = Map1.topping3_isabella(inputMap1);
        assertEquals(expectedMap1, actualMap1);

        //topping3({"salad": "pepper", "fries": "salt"}) →
        // {"spinach": "pepper", "salad": "pepper", "fries": "salt"}
        Map<String, String> expectedMap2 = new HashMap<>();
        expectedMap2.put("spinach", "pepper");
        expectedMap2.put("salad", "pepper");
        expectedMap2.put("fries", "salt");
        Map<String, String> inputMap2 = new HashMap<>();
        inputMap2.put("salad", "pepper");
        inputMap2.put("fries", "salt");
        Map<String, String> actualMap2 = new HashMap<>();
        actualMap2 = Map1.topping3_isabella(inputMap2);
        assertEquals(expectedMap2, actualMap2);
    }
}