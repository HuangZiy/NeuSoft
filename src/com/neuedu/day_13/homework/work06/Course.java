package com.neuedu.day_13.homework.work06;

public class Course {
    private String name;

    public String getName() {
        return name;
    }

    public Course(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
