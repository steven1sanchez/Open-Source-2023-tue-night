package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void topping1_mads_1() {
        // topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");

        Map<String, String> topping1 = Map1.topping1_mads(map);

        assertEquals("cherry", topping1.get("ice cream"));
        assertEquals("butter", topping1.get("bread"));

        map.clear();
        topping1.clear();

    }

    @Test
    void topping1_mads_2() {
        // topping1({}) → {"bread": "butter"}
        Map<String, String> map = new HashMap<>();

        Map<String, String> topping1 = Map1.topping1_mads(map);

        assertEquals("butter", topping1.get("bread"));

        map.clear();
        topping1.clear();
    }

    @Test
    void topping1_mads_3() {
        // topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
        Map<String, String> map = new HashMap<>();
        map.put("pancake", "syrup");

        Map<String, String> topping1 = Map1.topping1_mads(map);

        assertEquals("syrup", topping1.get("pancake"));
        assertEquals("butter", topping1.get("bread"));

        map.clear();
        topping1.clear();
    }

    @Test
    void topping1_mads_4() {
        // topping1({"bread": "dirt", "ice cream": "strawberries"}) → {"bread": "butter", "ice cream": "cherry"}
        Map<String, String> map = new HashMap<>();
        map.put("bread", "dirt");
        map.put("ice cream", "strawberries");

        Map<String, String> topping1 = Map1.topping1_mads(map);

        assertEquals("cherry", topping1.get("ice cream"));
        assertEquals("butter", topping1.get("bread"));

        map.clear();
        topping1.clear();
    }

    @Test
    void topping1_mads_5(){
        //topping1({"bread": "jam", "ice cream": "strawberries", "salad": "oil"}) → {"bread": "butter", "ice cream": "cherry", "salad": "oil"}
        Map<String, String> map = new HashMap<>();
        map.put("bread", "jam");
        map.put("ice cream", "strawberries");
        map.put("salad", "oil");

        Map<String, String> topping1 = Map1.topping1_mads(map);

        assertEquals("cherry", topping1.get("ice cream"));
        assertEquals("butter", topping1.get("bread"));
        assertEquals("oil", topping1.get("salad"));

        map.clear();
        topping1.clear();
    }
}