package com.neuedu.day_18.homework;

public class work02 {
    public static int func(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += func(i);
        }
        System.out.println(sum);
    }
}
