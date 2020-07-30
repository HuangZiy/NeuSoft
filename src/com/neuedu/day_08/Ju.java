package com.neuedu.day_08;

public class Ju extends Chess {

    public Ju(String name, int px, int py) {
        super(name, px, py);
    }

    @Override
    public void move(int x,int y) {
        this.setPx(x);
        this.setPy(y);
    }
}
