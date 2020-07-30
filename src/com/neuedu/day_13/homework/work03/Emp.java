package com.neuedu.day_13.homework.work03;

public class Emp {
    private String name;

    public Emp(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ']';
    }
}
