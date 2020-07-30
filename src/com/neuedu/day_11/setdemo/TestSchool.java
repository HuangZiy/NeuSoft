package com.neuedu.day_11.setdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSchool {
    public static void main(String[] args) {
        School s = new School();
        Student s1 = new Student("不靠谱",50);
        Student s2 = new Student("拜登",65);
        Student s3 = new Student("奥巴马",70);
        Student s4 = new Student("小布什",65);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
//        //信息
//        s.browse();
//        //总人数
//        System.out.println(s.getSNum());
//        //总分数
//        int sums=s.getScNum();
//        System.out.println(sums);
//        //平均分
//        int avgs=s.getAvgSc();
//        System.out.println(avgs);
//        //开除
//        s.showFind(s1);
//        s.showRemove(s1);
//        List<Integer> ilist = new ArrayList<>();
//        ilist.add(100);
//        ilist.add(50);
//        ilist.add(65);
//        ilist.add(200);
//        for (Integer i:ilist
//             ) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        Collections.sort(ilist);
//        for (Integer i:ilist
//        ) {
//            System.out.print(i+" ");
//        }
//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("OMEN");
//        stringList.add("HP");
//        stringList.add("Apple");
//        stringList.add("Huawei");
//        System.out.println();
//        for (String sl:stringList
//        ) {
//            System.out.print(sl+" ");
//        }
//        System.out.println();
//        Collections.sort(stringList);
//        for (String sl:stringList
//        ) {
//            System.out.print(sl+" ");
//        }
        s.sortscore();

        List<Person> plist = new ArrayList<>();
        Person p1 = new Person("小黄",21);
        Person p2 = new Person("小王",18);
        Person p3 = new Person("老李",29);
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
//        for (Person p:plist
//             ) {
//            p.show();
//        }
//        System.out.println();
//        Collections.sort(plist);
//        for (Person p:plist
//        ) {
//            p.show();
//        }
    }
}
