package com.neuedu.day_09.finalDemo;

public class TestTruck {
    public static void main(String[] args) {
    Truck t1 = new Truck();
    Truck t2 = new Truck();
    Object o =new Truck();

        System.out.println(t1.WEIGHT);
        System.out.println(t2.WEIGHT);

        System.out.println(Truck.WHEELS);
        System.out.println(t1.WHEELS);

    }
}
