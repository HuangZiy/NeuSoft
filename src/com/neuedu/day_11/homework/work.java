package com.neuedu.day_11.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class work {
    public static void Dual(){
        double x1=0;
        double x2=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入a:");
        double a = sc.nextDouble();
        System.out.print("请输入b:");
        double b = sc.nextDouble();
        System.out.print("请输入c:");
        double c = sc.nextDouble();
        double temp = Math.sqrt(b*b-4*a*c);
        double demo = 2*a;
        if (temp>0){
            x1=((-b)-temp)/demo;
            x2=((-b)+temp)/demo;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (temp==0){
            x1=((-b)+temp)/demo;
            System.out.println("x1 = " + x1);
        }else{
            System.out.println("该方程无解");
        }
    }


    public static void FindstrA(){
        Scanner sc=new Scanner(System.in);
        List<StringBuffer> slist = new ArrayList<>();
        int n=5;
        for (int i = 0; i <n ; i++) {
            String s = sc.nextLine();
            StringBuffer stringBuffer = new StringBuffer(s);
            slist.add(stringBuffer);
        }
        for (StringBuffer s:slist
             ) {
            for (int i = 0; i <s.length() ; i++) {
                if (s.charAt(i)=='a'){
                    System.out.println(s);
                    break;
                }
            }
        }
    }


    //3．定义一个字符串类型的集合，将字符串类型的元素按照字典次序从前向后排列后，输出所有元素，并找出最大值和最小值
    public static void work03(){
        List<String> stringList = new ArrayList<>();
        stringList.add("qwe");
        stringList.add("asd");
        stringList.add("zxc");
        stringList.sort(new SortStr());
        for (String s:stringList) {
            System.out.println(s);
        }
        System.out.println("头："+stringList.get(0));
        System.out.println("尾："+stringList.get(stringList.size()-1));
    }


    public static void main(String[] args) {
//        Dual();
//        FindstrA();
//        work03();
    }
}
