package com.neuedu.day_18.homework.work_01;

public class Company {
    Person[] ps;

    public void setPs(Person[] ps) {
        this.ps = ps;
    }

    public void show() {
        for (Person p : ps
        ) {
            System.out.println(p.getName() + "," + p.getSal());
        }
    }
}
