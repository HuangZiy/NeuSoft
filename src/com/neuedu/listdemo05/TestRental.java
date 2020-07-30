package com.neuedu.listdemo05;

import com.neuedu.day_08.day_08_homework_14.Compute;

public class TestRental {
    public static void main(String[] args) {
        Rental<Bike> rb = new Rental<>();
        Bike b1 = new Bike("捷安特",2000);
        Bike b2 = new Bike("凤凰",1000);

        rb.sendBack(b1);
        rb.sendBack(b2);

        Bike r = rb.rent();
        System.out.println("已出租的自行车信息，价格："+r.getPrice()+"，品牌："+r.getBrand());
        Rental<Computer> rc = new Rental<>();
        Computer c1 = new Computer("HP",3000);
        Computer c2 = new Computer("ASUS",2000);

        rc.sendBack(c1);
        rc.sendBack(c2);

        Computer cp = rc.rent();
        System.out.println("已出租的计算机信息，价格："+cp.getCPU()+"，品牌："+cp.getBrand());
    }

}
