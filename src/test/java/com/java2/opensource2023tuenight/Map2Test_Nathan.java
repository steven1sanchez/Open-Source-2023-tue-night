package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Map2Test_Nathan {

    @Test
    void firstSwap1_nathan() {
        // firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
        String[] strings = new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] expected = new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"};

        assertArrayEquals(expected, Map2.firstSwap_nathan(strings));
    }

    @Test
    void firstSwap2_nathan() {
        // firstSwap(["easy", "does", "it", "every", "ice", "eaten"]) → ["every", "does", "ice", "easy", "it", "eaten"]
        String[] strings = new String[]{"easy", "does", "it", "every", "ice", "eaten"};
        String[] expected = new String[]{"every", "does", "ice", "easy", "it", "eaten"};

        assertArrayEquals(expected, Map2.firstSwap_nathan(strings));
    }
}