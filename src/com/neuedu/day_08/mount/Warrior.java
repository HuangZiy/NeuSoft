package com.neuedu.day_08.mount;

public class Warrior extends Player {
    public Warrior(String job, String name) {
        super(job, name);
    }

    @Override
    public void fight() {
        System.out.println("双斧砍了过去");
    }
}
