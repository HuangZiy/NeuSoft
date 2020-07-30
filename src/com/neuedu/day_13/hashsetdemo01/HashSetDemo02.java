package com.neuedu.day_13.hashsetdemo01;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo02 {
    public static void main(String[] args) {
        Person p1 = new Person("曹操");
        Set<Person> pset = new HashSet<>();
        pset.add(p1);
        System.out.println(pset.contains(p1)?p1.getName()+"在集合中":p1.getName()+"不在集合中");
        Person p2 = new Person("曹操");
        System.out.println(pset.add(p2));
        System.out.println(pset.contains(p2)?p2.getName()+"在集合中":p2.getName()+"不在集合中");
    }
}
