package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Baylee {

    @Test
    public void firstSwap_baylee() {
//        firstSwap(["list", "of", "words", "swims", "over", "lily", "water", "wait"])
//                → ["lily", "over", "water", "swims", "of", "list", "words", "wait"]
        String[] arrayA = new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"};
        String[] arrayB = Map2.firstSwap_baylee(arrayA);
        assertEquals("lily", arrayB[0]);
        assertEquals("over", arrayB[1]);
        assertEquals("water", arrayB[2]);
        assertEquals("swims", arrayB[3]);
        assertEquals("of", arrayB[4]);
        assertEquals("list", arrayB[5]);
        assertEquals("words", arrayB[6]);
        assertEquals("wait", arrayB[7]);

//        firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"])
//                → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
        String[] arrayC = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String[] arrayD = Map2.firstSwap_baylee(arrayC);
        assertEquals("ay", arrayD[0]);
        assertEquals("by", arrayD[1]);
        assertEquals("ax", arrayD[2]);
        assertEquals("bx", arrayD[3]);
        assertEquals("ai", arrayD[4]);
        assertEquals("aj", arrayD[5]);
        assertEquals("bx", arrayD[6]);
        assertEquals("by", arrayD[7]);

    }
}