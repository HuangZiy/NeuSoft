package com.neuedu.day_18.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class work05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = 100;
        int m = 20;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * m);
            list.add(random);
            if (map.get(random) != null) {
                int value = map.get(random);
                value++;
                map.put(random, value);
                if (flag) {
                    System.out.println("第一次重复的数字是：" + random);
                    flag = false;
                }
            } else {
                int value = 1;
                map.put(random, value);
            }
        }
    }
}
