package com.neuedu.day_18.homework.work_01;

public abstract class Person {
    protected String name;
    protected int month;
    protected double sal;

    public Person(String name, int month, double sal) {
        this.name = name;
        this.month = month;
        this.sal = sal;
    }

    abstract public double sal();

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }
}
