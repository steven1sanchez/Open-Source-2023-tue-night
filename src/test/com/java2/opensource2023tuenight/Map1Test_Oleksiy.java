package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_Oleksiy {

    @Test
    void topping1_oleksiy() {
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");
        Map<String, String> map2 = Map1.topping1_oleksiy(map);

        assertEquals("cherry", map2.get("ice cream"));
        assertEquals("butter", map2.get("bread"));
        map.clear();
        map2.clear();

        map.put("bread", "jam");
        map.put("ice cream", "strawberries");
        map.put("salad", "oil");
        map2 = Map1.topping1_oleksiy(map);

        assertEquals("cherry", map2.get("ice cream"));
        assertEquals("butter", map2.get("bread"));
    }
}