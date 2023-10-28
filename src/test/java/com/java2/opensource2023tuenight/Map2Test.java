package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {

    @Test
    void word0_mads_1() {
        // word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] strings = new String[]{"a", "b", "a", "b"};
        map = Map2.word0_mads(strings);

        assertEquals(0, map.get("a"));
        assertEquals(0, map.get("b"));

        map.clear();

    }

    @Test
    void word0_mads_2() {
        // word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] strings = new String[]{"a", "b", "a", "c", "b"};
        map = Map2.word0_mads(strings);

        assertEquals(0, map.get("a"));
        assertEquals(0, map.get("b"));
        assertEquals(0, map.get("c"));

        map.clear();
    }

    @Test
    void word0_mads_3() {
        // word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] strings = new String[]{"c", "b", "a"};
        map = Map2.word0_mads(strings);

        assertEquals(0, map.get("a"));
        assertEquals(0, map.get("b"));
        assertEquals(0, map.get("c"));

        map.clear();
    }

    @Test
    void word0_mads_4() {
        // word0(["c", "c", "c", "c"]) → {"c": 0}
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] strings = new String[]{"c", "c", "c", "c"};
        map = Map2.word0_mads(strings);

        assertEquals(0, map.get("c"));

        map.clear();
    }

    @Test
    void word0_mads_5() {
        // word0([]) → {}
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] strings = new String[]{};
        map = Map2.word0_mads(strings);

        assertNull(map.get(""));
    }
}