package com.neuedu.listdemo05;

public class Bike {
    private String brand;
    private double price;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bike(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
