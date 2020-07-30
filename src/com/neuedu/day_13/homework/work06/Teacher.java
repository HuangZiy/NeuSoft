package com.neuedu.day_13.homework.work06;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
