package com.neuedu.day_08.day_08_homework_09;

public class Truck extends Car {
    private double payload;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                '}';
    }
    public void show(){
        super.show();
        System.out.println(payload);
    }
}
