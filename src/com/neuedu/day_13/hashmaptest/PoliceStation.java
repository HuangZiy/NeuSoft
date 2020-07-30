package com.neuedu.day_13.hashmaptest;

import com.neuedu.day_13.hashsetdemo01.Person;

import java.util.*;

public class PoliceStation {
    public static void main(String[] args) {
        HashMap<People,Pet> map = new HashMap<>();
        People p1 = new People("小王",1001);
        People p2 = new People("小李",1002);
        People p3 = new People("小黄",1003);

        Pet pe1 = new Pet("小白","狗");
        Pet pe2 = new Pet("小清","猫");
        Pet pe3 = new Pet("白白","狗");
        Pet pe4 = new Pet("白白白","猫");

        map.put(p1,pe1);
        map.put(p2,pe2);
        map.put(p3,pe3);
        map.put(p1,pe4);

        Set<Map.Entry<People,Pet>> set =map.entrySet();
        Set<Map.Entry<People,Pet>> set2 = map.entrySet();
        Iterator it = set.iterator();
        Iterator it2 = set.iterator();
        while (it.hasNext()){
            Map.Entry en1 = (Map.Entry) it.next();
//            while (it2.hasNext()){
//                Map.Entry en2 = (Map.Entry) it2.next();
//                if (en1.getKey().equals(en2.getKey())){
//                    System.out.println("Key："+en2.getKey()+"，Value"+en2.getValue());
//                }
//            }
            People people = (People) en1.getKey();
            Pet pet = (Pet) en1.getValue();

            System.out.println(people+","+pet);
        }
//        Iterator it3 = set2.iterator();
//        while (it3.hasNext()){
//            Map.Entry en3 = (Map.Entry) it3.next();
//            People people = (People) en3.getKey();
//            Pet pet = (Pet) en3.getValue();
//
//        }
//        System.out.println(set2);
    }

}
