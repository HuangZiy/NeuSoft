package com.neuedu.day_18.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class work03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("小李", "数学");
        map.put("小王", "语文");
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry en = (Map.Entry) it.next();
            String k = en.getKey().toString();
            String v = en.getValue().toString();
            System.out.println(k + "," + v);
        }
    }

}
