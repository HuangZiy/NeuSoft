package com.neuedu.day_13.homework.work07;

public class Emp {
    private String name;
    private String job;
    private double sal;

    public double getSal() {
        return sal;
    }

    public Emp(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
