package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_JacobL {

    @Test
    void jacobLPairsMap2(){
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        String[] arr = new String[]{"code", "bug"};

        Map<String, String> map1 = Map2.pairs_jacobL(arr);

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "g");
        map2.put("c", "e");

        assertEquals(map1, map2);
        map1.clear();
        map2.clear();
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        String[] arr2 = new String[]{"man", "moon", "main"};

        map1 = Map2.pairs_jacobL(arr2);

        map2.put("m", "n");

        assertEquals(map1, map2);
        map1.clear();
        map2.clear();
        //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        String[] arr3 = new String[]{"man", "moon", "good", "night"};

        map1 = Map2.pairs_jacobL(arr3);

        map2.put("g", "d");
        map2.put("m", "n");
        map2.put("n", "t");

        assertEquals(map1, map2);
    }
}