package com.neuedu.day_11.setdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetDemo {
    public static void main(String[] args) {
        List list01 = new ArrayList();
        int len=list01.size();
//        list01.add(1);
//        list01.add("12");
//        list01.add(1.0);
//        for (int i = 0; i < list01.size() ; i++) {
//            System.out.print(list01.get(i));
//        }
//        list01.add(1,2);
//        for (int i = 0; i < list01.size() ; i++) {
//            System.out.print(list01.get(i));
//        }
//        List<Integer> ilist=new ArrayList<>();
//        ilist.add(1);
//        ilist.add(2);
//        System.out.println("集合中元素数量："+ilist.size());
//        ilist.add(2,50);
//        ilist.add(3,60);
//        System.out.println("集合中元素数量："+ilist.size());
//        int j=ilist.get(3);
//        System.out.println("j="+j);
//        System.out.println(ilist.contains(40)?"bh":"bbh");
//        int flist = ilist.remove(0);
//
//
//        List<Integer> mylist=new ArrayList<>();
//        mylist.add(flist);
//        System.out.println(mylist.size());
//        System.out.println("遍历");
//        for (Integer i:ilist
//             ) {
//            System.out.println(i);
//        }
//
//        Iterator<Integer> it = ilist.iterator();
//        System.out.println("使用迭代器进行遍历");
//        while (it.hasNext()){
//            Integer n = it.next();
//            System.out.println(n);
//        }
        List<String> slist = new ArrayList<>();
        slist.add("Hello");
        slist.add("World");
        slist.add("My");
        slist.add("Name");
        slist.add("Is");
        Iterator<String> it = slist.iterator();
        while (it.hasNext()){
            String its=it.next();
            System.out.println(its);
        }

    }
}
