package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Alina {

    @Test
    void wordLen_alina() {
        // wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
        String[] list = {"a", "bb", "a", "bb"};
        Map<String, Integer> map = Map2.wordLen_alina(list);
        assertEquals(2, map.get("bb"));
        assertEquals(1, map.get("a"));

        // wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
        String[] list2 = {"this", "and", "that", "and"};
        Map<String, Integer> map2 = Map2.wordLen_alina(list2);
        assertEquals(4, map2.get("that"));
        assertEquals(3, map2.get("and"));
        assertEquals(4, map2.get("this"));
    }
}