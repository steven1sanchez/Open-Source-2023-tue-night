package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_Oleksiy {

    @Test
    void firstChar_oleksiy() {
        String[] strings1 = {"salt", "tea", "soda", "toast"};
        Map<String, String> map = Map2.firstChar_oleksiy(strings1);

        assertEquals("saltsoda", map.get("s"));
        assertEquals("teatoast", map.get("t"));

        String[] strings2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        map = Map2.firstChar_oleksiy(strings2);

        assertEquals("aaaAA", map.get("a"));
        assertEquals("bb", map.get("b"));
        assertEquals("cccCC", map.get("c"));
        assertEquals("d", map.get("d"));
    }
}