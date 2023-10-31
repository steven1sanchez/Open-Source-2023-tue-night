package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test_JonathanBeck {

  @Test
  void allSwap__Jonathan_Beck() {

    //TEST 1
    //set up the string list they ask for
    String[] strings = new String[2];
    strings[0] = "ab";
    strings[1] = "ac";

    //set up they string list they expect
    String[] strings2 = new String[2];
    strings2[0] = "ac";
    strings2[1] = "ab";

    //run allswap on mine
    String[] strings3 = Map2.allSwap__Jonathan_Beck(strings);

    //assert they are equal
    assertEquals(strings2[0], strings3[0]);
    assertEquals(strings2[1], strings3[1]);

    //TEST 2

    //setup the one they ask for
    String[] strings4 = new String[8];
    strings4[0] = "ax";
    strings4[1] = "bx";
    strings4[2] = "cx";
    strings4[3] = "cy";
    strings4[4] = "by";
    strings4[5] = "ay";
    strings4[6] = "aaa";
    strings4[7] = "azz";

    //setup the one they expect
    String[] strings5 = new String[8];
    strings5[0] = "ay";
    strings5[1] = "by";
    strings5[2] = "cy";
    strings5[3] = "cx";
    strings5[4] = "bx";
    strings5[5] = "ax";
    strings5[6] = "azz";
    strings5[7] = "aaa";

    //run all swap on mine
    String[] strings6 = Map2.allSwap__Jonathan_Beck(strings4);

    //assert they are equal
    for (int i = 0; i < 8; i++)
      assertEquals(strings5[i], strings6[i]);
  }

  ;

}
