package com.java2.opensource2023tuenight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class Map1Test_JaredHutton {
    @Test
    public void topping3_jaredHutton_test() {
        Map mapTest1 = new HashMap<String, String>();
        Map mapExpected1 = new HashMap<String, String>();
        mapTest1.put("potato", "ketchup");
        mapExpected1.put("potato", "ketchup");
        mapExpected1.put("fries", "ketchup");
        assertEquals(mapExpected1, Map1.topping3_jaredHutton(mapExpected1));
        Map mapTest2 = new HashMap<String, String>();
        Map mapExpected2 = new HashMap<String, String>();
        mapTest1.put("potato", "butter");
        mapExpected1.put("potato", "butter");
        mapExpected1.put("fries", "butter");
        assertEquals(mapExpected2, Map1.topping3_jaredHutton(mapExpected2));
    }
}
