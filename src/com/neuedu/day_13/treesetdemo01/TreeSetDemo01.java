package com.neuedu.day_13.treesetdemo01;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(100);
        set.add(300);
        set.add(50);
        set.add(250);
        set.add(180);
        set.add(70);

        System.out.println(set.size());

        Iterator<Integer> iti = set.iterator();

        while(iti.hasNext()){
            int i=iti.next();
            System.out.print(i+" ");
        }

        System.out.println();
        TreeSet<Integer> si= (TreeSet<Integer>) set.subSet(50,180);

        Iterator<Integer> its = si.iterator();
        while(its.hasNext()){
            int i=its.next();
            System.out.print(i+" ");
        }

    }
}
