package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
class Map2TestIsabella {

    @Test
    void wordAppend_isabella() {
        //wordAppend(["not", "and", "or", "and", "this", "and", "or", "that", "not"]) → "andornot"
        String inputArray1[] = new String[] {"not", "and", "or", "and", "this", "and", "or", "that", "not"};
        String expectedResult1 = "andornot";
        String actualResult1 = Map2.wordAppend_isabella(inputArray1);
        assertEquals(expectedResult1, actualResult1);

        //wordAppend(["xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"]) → "xxyyzzxx"
        String inputArray2[] = new String[] {"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"};
        String expectedResult2 = "xxyyzzxx";
        String actualResult2 = Map2.wordAppend_isabella(inputArray2);
        assertEquals(expectedResult2, actualResult2);

    }
}