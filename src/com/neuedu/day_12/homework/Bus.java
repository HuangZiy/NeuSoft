package com.neuedu.day_12.homework;

public class Bus extends Car {
    private int zw;
    private double price;

    public Bus(String carNumber, String brond, String color, double kil, int zw, double price) {
        super(carNumber, brond, color, kil);
        this.zw = zw;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
