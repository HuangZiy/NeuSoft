package com.neuedu.day_19.homework;


import java.util.*;

public class work13 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        a.add(3);
        Collections.sort(a);
        a.add(2);
        Collections.reverse(a);
        System.out.println(a);
    }
}

