package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Steven {

    @Test
    void allSwap_steven() {
        String[] input = {"ab", "ac"};
        String[] expected = {"ac", "ab"};
        String[] result = Map2.allSwap_steven(input);
        assertArrayEquals(expected, result);
        String[] input2 = {"4", "8", "15", "16", "23", "42"};
        String[] expected2 = {"42", "8", "16", "15", "23", "4"};
        String[] result2 = Map2.allSwap_steven(input2);
        assertArrayEquals(expected2, result2);
    }
}