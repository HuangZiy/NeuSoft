package com.neuedu.day_13.homework.work02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        Emp e1 = new Emp(1001,"小王",3000);
        Emp e2 = new Emp(1002,"老王",5000);
        Emp e3 = new Emp(1003,"小李",2000);
        Emp e4 = new Emp(1004,"小黄",9000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.sort(new SortSal());
        Iterator it = list.iterator();
        while (it.hasNext()){
            Emp e = (Emp) it.next();
            System.out.println(e);
        }
    }
}
