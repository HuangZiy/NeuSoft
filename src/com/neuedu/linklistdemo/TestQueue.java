package com.neuedu.linklistdemo;

import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<>();
        for (int i = 0; i < 5; i++) {
            queue.put(scanner.nextLine());
            System.out.println(queue);
        }
        queue.showAll();
        System.out.println("队列的长度为："+queue.size());
        while(!queue.isEmpty()){
            String str = (String) queue.get();
            System.out.println("取出："+str);
            System.out.println(queue);
        }
    }
}
