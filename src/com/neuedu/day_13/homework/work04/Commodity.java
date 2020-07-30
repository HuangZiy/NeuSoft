package com.neuedu.day_13.homework.work04;

public class Commodity {
    private String name;
    private double price;
    private int number;

    public Commodity(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ']';
    }
}
