package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_JonathanBeck {

  @Test
  void mapAB2_Jonathan_Beck() {

    //test 1
    Map<String, String> map = new HashMap<>();
    map.put("a","aaa");
    map.put("b","aaa");
    map.put("c","cake");
    //mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    Map<String, String> map2 = Map1.mapAB2_Jonathan_Beck(map);
    Map<String,String> map3 = new HashMap<>();
    map3.put("c","cake");
    assertEquals(map2,map3);

    //test 2
    Map <String, String> map4 = new HashMap<>();
    map4.put("a","a");
    map4.put("b","b");
    map4.put("z","zebra");
    Map<String, String> map5 = Map1.mapAB2_Jonathan_Beck(map4);
    Map<String, String> map6 = new HashMap<>();
    map6.put("a","a");
    map6.put("b","b");
    map6.put("z","zebra");
    assertEquals(map5,map6);







  }
}