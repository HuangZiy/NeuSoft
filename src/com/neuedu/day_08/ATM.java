package com.neuedu.day_08;

import com.neuedu.day_08.Computer;

public class ATM extends Computer {
    //特有属性
    private int money;

    public ATM(int money,int cpu,int menmory,int harddisk) {
        super(5,16,512);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ATM机现有的存款额度是:"+money);
    }

    public void draw(int output){
        if (money>=output){
            money-=output;
            System.out.println("用户已经正常取出"+output+"元");
        }
        else {
            System.out.println("ATM余额不足！");
        }
        System.out.println("ATM还剩下："+money);
    }
}
