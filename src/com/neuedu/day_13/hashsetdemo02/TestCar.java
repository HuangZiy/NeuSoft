package com.neuedu.day_13.hashsetdemo02;

import java.util.HashSet;
import java.util.Set;

public class TestCar {
    public static void main(String[] args) {
        Set<Car> sc = new HashSet<>();
        Car c1 = new Car("宝马","123");
        Car c2 = new Car("奔驰","345");
        Car c3 = new Car("奥迪","678");
        Car c4 = new Car("奥迪","678");
//        sc.add(c1);
//        sc.add(c2);
//        sc.add(c3);
//        sc.add(c4);

        VehicleMg vm = new VehicleMg(sc);
        c1.show();
        System.out.println("登记："+vm.registered(c1));
        c2.show();
        System.out.println("登记："+vm.registered(c2));
        c3.show();
        System.out.println("登记："+vm.registered(c3));
        c4.show();
        System.out.println("登记："+vm.registered(c4));
        c1.show();
        System.out.println("注销"+vm.Logout(c1));
        vm.showCar();
        System.out.print("找到的车辆为：");
        vm.find(c3).show();
        System.out.println("该小区的车辆数量为："+vm.numCar());
        System.out.println();
    }
}
