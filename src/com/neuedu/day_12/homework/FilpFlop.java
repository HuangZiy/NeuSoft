package com.neuedu.day_12.homework;

public class FilpFlop {
    private int num;

    public FilpFlop(int num) {
        this.num = num;
    }

    public void show(){
        if (num%3==0&&num%5==0){
            System.out.println("FilpFlop");
        }else if (num%3==0){
            System.out.println("Filp");
        }else if (num%5==0){
            System.out.println("Flop");
        }else{
            System.out.println("没有找到");
        }

    }
}
