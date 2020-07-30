package com.neuedu.day_09.excptionWork;

public class A {
    public static void divisor(String [] args){
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = x/y;
            System.out.println(x+"除于"+y+"等于"+z);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("总是被执行");
        }

    }
    public static void compreaStr(String s1,String s2){
        try {
            System.out.println(s1.equals(s2));
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("总是被执行");
        }
    }
    public static void main(String[] args) {
        String a = null;
        String b = "a ";
        A.compreaStr(a,b);
    }
}
