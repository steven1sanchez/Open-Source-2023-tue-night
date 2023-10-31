package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Kirsten {

    @Test
    void allSwap_kirsten() {
        // allSwap(["ab", "ac"]) → ["ac", "ab"]
        String[] strings = new String[] {"ab", "ac"};
        strings = Map2.allSwap_kirsten(strings);
        String[] expected = new String[] {"ac", "ab"};
        assertTrue(Arrays.equals(expected, strings));

        // allSwap(["easy", "does", "it", "every", "ice", "eaten"]) → ["every", "does", "ice", "easy", "it", "eaten"]
        String[] strings2 = new String[] {"easy", "does", "it", "every", "ice", "eaten"};
        strings2 = Map2.allSwap_kirsten(strings2);
        String[] expected2 = new String[] {"every", "does", "ice", "easy", "it", "eaten"};
        assertTrue(Arrays.equals(expected2, strings2));
    }
}