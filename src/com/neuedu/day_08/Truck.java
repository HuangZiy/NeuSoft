package com.neuedu.day_08;

public class Truck extends Viechle {
    public Truck(String type) {
        super(type);
    }

    @Override
    public double fee() {
        return 100;
    }
}
