package com.java2.opensource2023tuenight;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test_JacobL {

    @Test
    void mapAB_JacobL(){
        //topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        Map map2 = Map1.topping2_jacobL(map1);

        Map<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "cherry");
        map3.put("ice cream", "cherry");

        assertEquals(map3, map2);
        map1.clear();
        map2.clear();
        map3.clear();
        //topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
        map1.put("spinach", "dirt");
        map1.put("ice cream", "cherry");

        map2 = Map1.topping2_jacobL(map1);

        map3.put("yogurt", "cherry");
        map3.put("spinach", "nuts");
        map3.put("ice cream", "cherry");

        assertEquals(map3, map2);
        map1.clear();
        map2.clear();
        map3.clear();
        //topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
        map1.put("yogurt", "salt");

        map2 = Map1.topping2_jacobL(map1);

        map3.put("yogurt", "salt");
        assertEquals(map2, map3);
    }

}