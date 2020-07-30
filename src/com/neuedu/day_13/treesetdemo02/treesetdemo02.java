package com.neuedu.day_13.treesetdemo02;

import com.neuedu.day_13.hashsetdemo01.Person;
import com.neuedu.day_13.hashsetdemo02.Car;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetdemo02 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
//        Car c1 = new Car("玛莎拉蒂","10");
//        Car c2 = new Car("宾利","5");
//        Car c3 = new Car("宝马","20");
//        Car c4 = new Car("雪铁龙","8");
        Person p1 = new Person("啊王");
        Person p2 = new Person("吧王");
        Person p3 = new Person("老王");
        Person p4 = new Person("小小王");
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);

        Iterator<Person> it = ts.iterator();
        while (it.hasNext()){
            Person c = it.next();
            System.out.println(c.getName());
        }

    }
}
