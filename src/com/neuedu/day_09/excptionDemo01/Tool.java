package com.neuedu.day_09.excptionDemo01;

public class Tool {
    public static void divide(int x,int y){
        try {
            int z = x/y;
            System.out.println(x+"/"+y+"="+z);
        }catch (Exception e){
            if (e instanceof  ArithmeticException)
                System.out.println("除数不能为零,请重试！");
            e.printStackTrace();
        }finally {

        }
    }
    public static int arrSum(int arr[]){
        int sum=0;
        try {
            for (int i = 0; i <=arr.length ; i++) {
                sum+=arr[i];
            }
            return sum;
        }catch (IndexOutOfBoundsException e){
            System.out.println("数组下标越界了");
            sum=-1;
        }
        finally {
            return sum;
        }
    }
}
