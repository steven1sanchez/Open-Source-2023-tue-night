package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_andres {

    @Test
    void firstChar_Andres(){
        //firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
        String[] strings = {"salt", "tea", "soda", "toast"};
        Map<String, String> map = Map2.firstChar_Andres(strings);
        assertEquals("saltsoda", map.get("s"));
        assertEquals("teatoast", map.get("t"));

        //firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        String[] strings2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        Map<String, String> map2 = Map2.firstChar_Andres(strings2);
        assertEquals("aaaAA", map2.get("a"));
        assertEquals("bb", map2.get("b"));
        assertEquals("cccCC", map2.get("c"));
        assertEquals("d", map2.get("d"));

        //firstChar([]) → {}
        String[] strings3 = {};
        Map<String, String> map3 = Map2.firstChar_Andres(strings3);
        assertEquals(null, map3.get(""));
    }

}