package com.neuedu.day_08;

public class Bus extends Viechle {

    public Bus(String type) {
        super(type);
    }

    @Override
    public double fee() {
        return 50;
    }
}
