package com.neuedu.view.impl;

import com.neuedu.biz.impl.AdminBizImpl;
import com.neuedu.biz.impl.BusinessBizimpl;
import com.neuedu.biz.impl.FoodBizImpl;
import com.neuedu.view.mainView;

import java.util.Scanner;

public class Main implements mainView {
    BusinessBizimpl bbi;
    AdminBizImpl abi;
    FoodBizImpl fbi;

    public Main(){
        bbi=new BusinessBizimpl();
        abi=new AdminBizImpl();
        fbi=new FoodBizImpl();
    }
    @Override
    public void main() {
        Scanner sc = new Scanner(System.in);
        BusinessViewImpl bvi = new BusinessViewImpl();
        AdminViewImpl avi = new AdminViewImpl();
        boolean flag = true;
        while (flag){
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
            System.out.println("|一一一一一一一一一一一一饿了么后台一一一一一一一一一一一一一|");
            System.out.println("|一一1. 商家登录一一一一一一一一一一一一2.管理员登录一一一一|");
            System.out.println("|一一一一一一一一一一一一一0.退出一一一一一一一一一一一一一一|");
            System.out.println("|一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一|");
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一");
            System.out.print("请选择登录模式(0~2)：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bvi.login();;
                    break;
                case 2:
                    avi.login();;
                    break;
                case 0:
                    flag=false;
                    System.out.println("程序已退出！");
                    break;
                default:
                    System.out.println("输入出错！请重新输入0~3的整数");
                    break;
            }
        }
    }
}
