package com.neuedu.day_13.mapdemo03;

import com.neuedu.day_13.hashsetdemo01.Person;
import com.neuedu.day_13.hashsetdemo02.Car;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo03 {
    public static void main(String[] args) {
        Map<Person, Car> map = new HashMap<>();

        map.put(new Person("刘备"),new Car("的卢","10"));
        map.put(new Person("吕布"),new Car("赤兔","30"));
        map.put(new Person("赵云"),new Car("奔驰","5"));

        Person p = new Person("刘备");
        Car c = map.get(p);
        c.show();

        c = map.get(c);
        map.put(new Person("关羽"),c);
        Car cc=map.get(new Person("刘备"));
        cc.show();
    }
}
