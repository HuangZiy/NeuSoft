package com.neuedu.day_12.homework;

public class TestCarCompany {
    public static void main(String[] args) {
        Company<Car> c = new Company<>();
        LittleCar lc = new LittleCar("6","宝马","白色",100,"55i",500);
        Bus bus = new Bus("6","宝马","白色",100,17,1000);
        System.out.println(c.money(lc,3));
        System.out.println(c.money(bus,4));
    }
}
