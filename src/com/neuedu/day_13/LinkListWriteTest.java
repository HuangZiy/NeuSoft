package com.neuedu.day_13;

import java.util.LinkedList;

public class LinkListWriteTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.addFirst(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("链表花费的时间为："+(end-start));
    }
}
