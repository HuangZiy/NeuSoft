package com.neuedu.day_13.hashsetdemo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(50);
        set.add(30);
        set.add(80);
        set.add(10);

        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
        System.out.println(set.contains(100)?"100在其中":"100不在其中");
        System.out.println("set中元素的数量："+set.size());
        set.remove(100);
        System.out.println(set.contains(100)?"100在其中":"100不在其中");
    }
}
