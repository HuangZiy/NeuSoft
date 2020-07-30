package com.neuedu.day_08;

public class Car extends Viechle {
    public Car(String type) {
        super(type);
    }

    @Override
    public double fee() {
        return 25;
    }
}
