package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Nik {

    @Test
    void firstChar_Nik() {
        //Test1
        //firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
        String[] input1 = {"salt", "tea", "soda", "toast"};

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("s", "saltsoda");
        expectedMap.put("t", "teatoast");

        Map<String, String> actualMap = Map2.firstChar_Nik(input1);

        assertEquals(actualMap, expectedMap);

        expectedMap.clear();
        actualMap.clear();

        //Test 2
        //firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        String[] input2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};

        expectedMap.put("a", "aaaAA");
        expectedMap.put("b", "bb");
        expectedMap.put("c", "cccCC");
        expectedMap.put("d", "d");

        actualMap = Map2.firstChar_Nik(input2);

        assertEquals(actualMap, expectedMap);
    }
}