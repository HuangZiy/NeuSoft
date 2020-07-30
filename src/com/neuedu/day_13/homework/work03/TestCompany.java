package com.neuedu.day_13.homework.work03;

public class TestCompany {
    public static void main(String[] args) {
        Company company = new Company();
        Emp e1 = new Emp("小王");
        Emp e2 = new Emp("老王");
        Emp e3 = new Emp("小李");
        Emp e4 = new Emp("小黄");
        company.add(e1);
        company.add(e2);
        company.add(e3);
        company.add(e4);
        Emp e=company.lottery();
        System.out.println("中奖的人是："+e);
    }


}
