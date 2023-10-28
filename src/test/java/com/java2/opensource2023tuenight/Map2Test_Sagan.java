package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Map2Test_Sagan {

    @Test
    void wordMultiple_sagan() {
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        String[] array = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> map = Map2.wordMultiple_sagan(array);

        assertEquals(true, map.get("a"));
        assertEquals(true, map.get("b"));
        assertEquals(false, map.get("c"));
    }
}
