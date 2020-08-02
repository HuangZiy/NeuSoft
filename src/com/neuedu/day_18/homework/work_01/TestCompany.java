package com.neuedu.day_18.homework.work_01;

public class TestCompany {
    public static void main(String[] args) {
        Person[] ps;
        Company cm = new Company();
        normal nm = new normal("小李", 7, 2000);
        Hour hour = new Hour("小王", 7, 0, 250, 20);
        SeleMan sm = new SeleMan("小黄", 6, 0, 200000, 0.05);
        hour.sal();
        sm.sal();
        ps = new Person[]{nm, hour, sm};
        cm.setPs(ps);
        cm.show();
    }

}
