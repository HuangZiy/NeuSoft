package com.neuedu.day_13.homework.work07;

public class TestCompany {
    public static void main(String[] args) {
        Emp e1 = new Emp("小黄","总经理",10000);
        Emp e2 = new Emp("小王","员工",5000);
        Emp e3 = new Emp("小李","董事长",20000);
        String id1 = "NEU001";
        String id2 = "NEU002";
        String id3 = "NEU003";
        Company company = new Company();
        company.add(id1,e1);
        company.add(id2,e2);
        company.add(id3,e3);
        System.out.println("人数："+company.numOfPeople());
        company.showAll();
        System.out.println("按员工编号查找：");
        company.find("NEU001");
        System.out.println(company.avgSal());
    }
}
