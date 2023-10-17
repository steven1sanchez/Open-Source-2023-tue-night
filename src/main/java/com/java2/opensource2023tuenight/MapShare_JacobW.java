package com.java2.opensource2023tuenight;
import java.util.Map;

public class MapShare_JacobW {
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if(map.get("a") != null && !map.get("a").equals("")){
            map.put("b", map.get("a"));
        }
        return map;
    }
}
