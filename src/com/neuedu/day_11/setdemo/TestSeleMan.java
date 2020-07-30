package com.neuedu.day_11.setdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSeleMan {
    public static void main(String[] args) {
        List<SeleMan> smlist = new ArrayList<>();
        Comparator<SeleMan> byDegree = new sortByDegree();
        Comparator<SeleMan> byName = new sortByName();
        SeleMan p1 = new SeleMan("阿黄",100);
        SeleMan p2 = new SeleMan("表哥",10);
        SeleMan p3 = new SeleMan("沈啊",300);
        SeleMan p4 = new SeleMan("陈吧",200);
        smlist.add(p1);
        smlist.add(p2);
        smlist.add(p3);
        smlist.add(p4);
        System.out.println("排序前");
        for (SeleMan s:smlist
             ) {
            System.out.println(s);
        }
        System.out.println("名字排序后：");
        smlist.sort(byName);
        for (SeleMan s:smlist
        ) {
            System.out.println(s);
        }
        System.out.println("销售额排序后：");
        smlist.sort(byDegree);
        for (SeleMan s:smlist
        ) {
            System.out.println(s);
        }
    }
}
