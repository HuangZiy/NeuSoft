package com.neuedu.day_08;

public class Bing extends Chess {
    public Bing(String name, int px, int py) {
        super(name, px, py);
    }

    @Override
    public void move(int x, int y) {
        int dx = Math.abs(this.getPx()-x);
        int dy = Math.abs(this.getPy()-y);
    }
}
