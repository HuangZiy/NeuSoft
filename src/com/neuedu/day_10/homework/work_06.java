package com.neuedu.day_10.homework;

import java.util.Stack;

public class work_06 {
    public static boolean Palindrome(int n){
        int m = n;
        int sum=n%10;
        n/=10;
        while (n!=0){
            sum*=10;
            sum+=n%10;
            n/=10;
        }
        if (sum==m){
            return true;
        }else{
            return false;
        }
//        Stack<Integer> stack = new Stack<>();
//        int m = n;
//        int sum = 0;
//        while (n!=0){
//            stack.push(n%10);
//            n/=10;
//            System.out.println(n);
//        }
//        while (!stack.empty()){
//            sum*=10;
//            sum+=stack.pop();
//            System.out.println(sum);
//        }
//        System.out.println(sum);
//        if (sum==m){
//            return true;
//        }else{
//            return false;
//        }
    }

    public static void main(String[] args) {
        System.out.println(Palindrome(1234524321));
    }
}
