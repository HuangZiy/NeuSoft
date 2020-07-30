package com.neuedu.linklistdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("neusoft");
        ll.add("ausus");

        System.out.println(ll);
        ll.addFirst("microsoft");
        System.out.println(ll);
        ll.offerFirst("intel");
        System.out.println(ll);
        ll.push("Google");
        System.out.println(ll);
        ll.addLast("AMD");
        System.out.println(ll);
        ll.offerLast("NVIDIA");
        System.out.println(ll);
        ll.add(1,"HP");
        System.out.println(ll);
        ll.set(1,"Qucomm");
        System.out.println(ll);
        String first = ll.poll();
        System.out.println(first);
        System.out.println(ll);
        first=ll.peek();
        System.out.println(first);
        System.out.println(ll);
    }

}
