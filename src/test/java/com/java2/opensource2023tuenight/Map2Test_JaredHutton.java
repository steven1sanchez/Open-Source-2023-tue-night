package com.java2.opensource2023tuenight;

import com.java2.opensource2023tuenight.Map2;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Map2Test_JaredHutton {
    @Test
    public void firstSwap_jaredHutton_test() {
        String[] stringsTest1 = {"ab", "ac"};
        String[] stringsExpected1 = {"ac", "ab"};
        String[] stringsActual1 = Map2.firstSwap_jaredHutton(stringsTest1);
        boolean failFound1 = stringsExpected1.length != stringsActual1.length;

        for (int strix = 0; !failFound1 && strix < stringsActual1.length; ++strix) {
            failFound1 = !(stringsActual1[strix].equals(stringsExpected1[strix]));
        }

        assertTrue(!failFound1);

        String[] stringsTest2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] stringsExpected2 = {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"};
        String[] stringsActual2 = Map2.firstSwap_jaredHutton(stringsTest2);
        boolean failFound2 = stringsExpected2.length != stringsActual2.length;

        for (int strix = 0; !failFound2 && strix < stringsActual2.length; ++strix) {
            failFound2 = !(stringsActual2[strix].equals(stringsExpected2[strix]));
        }

        assertTrue(!failFound2);
    }
}
