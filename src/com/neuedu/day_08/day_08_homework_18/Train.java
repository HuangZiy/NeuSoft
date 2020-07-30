package com.neuedu.day_08.day_08_homework_18;

public class Train implements Charge {

    @Override
    public double getFee(int distance) {
        return distance;
    }
}
