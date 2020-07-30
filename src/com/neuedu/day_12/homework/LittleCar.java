package com.neuedu.day_12.homework;

public class LittleCar extends Car {
    private String chexing;
    private double price;

    public LittleCar(String carNumber, String brond, String color, double kil, String chexing, double price) {
        super(carNumber, brond, color, kil);
        this.chexing = chexing;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
