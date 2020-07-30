package com.neuedu.day_13;

import java.util.LinkedList;
import java.util.List;

public class ArrayListWriteTest {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            integerList.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList花费的时间为："+(end-start));
    }
}
