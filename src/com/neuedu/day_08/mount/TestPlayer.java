package com.neuedu.day_08.mount;

public class TestPlayer {
    public static void main(String[] args) {
        Player p = new Warrior("战士","兽人");
        Mount m = new Tiger();
        p.move();
        p.fight();
        p.setMount(m);
        p.move();
        p.fight();
    }
}
