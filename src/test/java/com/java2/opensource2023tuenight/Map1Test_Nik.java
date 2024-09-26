package com.java2.opensource2023tuenight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class Map1Test_Nik {

    @Test
    void Map1Test_Nik()
    {
        //Test 1
        //mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
        Map<String, String> actualMap = new HashMap<>();
        actualMap.put("a", "aaa");
        actualMap.put("b", "bbb");
        actualMap.put("c", "ccc");

        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "aaa");
        expectedMap.put("b", "aaa");

        Map1.mapShare_Nik(actualMap);

        assertEquals(actualMap, expectedMap);

        actualMap.clear();
        expectedMap.clear();

        //Test 2
        //mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
        actualMap.put("b", "xyz");
        actualMap.put("c", "ccc");

        expectedMap.put("b", "xyz");

        Map1.mapShare_Nik(actualMap);

        assertEquals(actualMap, expectedMap);

    }
}