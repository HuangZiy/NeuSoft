package com.neuedu.view.impl;

import com.neuedu.biz.impl.AdminBizImpl;
import com.neuedu.biz.impl.BusinessBizimpl;
import com.neuedu.biz.impl.FoodBizImpl;
import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;
import com.neuedu.view.AdminView;

import java.util.List;
import java.util.Scanner;

public class AdminViewImpl implements AdminView {
    BusinessBizimpl bbi;
    AdminBizImpl abi;
    FoodBizImpl fbi;

    public AdminViewImpl() {
        bbi = new BusinessBizimpl();
        abi = new AdminBizImpl();
        fbi = new FoodBizImpl();
    }

    @Override
    public void login() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入账户(退出0)：");
            String id = sc.nextLine();
            if (id.equals("0")) {
                break;
            }
            System.out.println("请输入密码(退出0)：");
            String pwd = sc.nextLine();
            if (pwd.equals("0")) {
                break;
            } else if (abi.checkLogin(id, pwd)) {
                System.out.println("登录成功");
                Admin a = abi.getAdmin(id);
                Menu(a);
                flag = false;
            } else {
                System.out.println("登录失败,请重新输入账户密码");
                continue;
            }
        }
    }

    @Override
    public void regisBsn(Admin a) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入账户：");
            String bacc = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            System.out.println("请输入店铺名称：");
            String bname = sc.nextLine();
            System.out.println("请输入管理员编号：");
            int aid = sc.nextInt();
            System.out.println(a.getAid());
            Business b = new Business(aid, bacc, pwd, bname);
            if (abi.regisBsn(a, b)) {
                System.out.println("添加成功！");
                flag = false;
            } else {
                System.out.println("添加失败！请重新填写信息！");
            }
        }
    }

    @Override
    public void Menu(Admin a) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
            System.out.println("|一一一一一一一一一一一一第一级菜单一一一一一一一一一一一一一|");
            System.out.println("|一一1.所有商家信息一一一一一一一一一2.搜索商家 一一一一一一|");
            System.out.println("|一一3.新建商家 一一一一一一一一一一4.删除商家一一一一一一一|");
            System.out.println("|一一一一一一一一一一一一 0.退出 一一一一一一一一一一一一一一|");
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
            System.out.print("请选择你的选择(0~4的整数)：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showAll(a);
                    break;
                case 2:
                    likeBsn(a);
                    break;
                case 3:
                    regisBsn(a);
                    break;
                case 4:
                    deleteBsn();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("请输入0~4的整数");
                    break;
            }
        }
    }

    @Override
    public void showAll(Admin a) {
        List<Business> blist;
        blist = abi.showAll(a);
        for (Business b : blist
        ) {
            System.out.println(b);
        }
    }

    @Override
    public void likeBsn(Admin a) {
        Scanner sc = new Scanner(System.in);
        List<Business> blist;
        System.out.print("请输入商家名：");
        String pattern = "%" + sc.nextLine() + "%";
        blist = abi.showLike(a, pattern);
        if (!blist.isEmpty()) {
            for (Business b : blist
            ) {
                System.out.println(b);
            }
        } else {
            System.out.println("找不到符合的商家");
        }
    }

    @Override
    public void deleteBsn() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("是否需要删除商家(请输入y&n)：");
        String ip = sc.next();
        while (flag && ip.equalsIgnoreCase("y")) {
            System.out.print("请输入需要删除的商家的编号：");
            int bid = sc.nextInt();
            Business b = bbi.getBusiness(bid);
            if (b == null) {
                System.out.println("输入的编号不存在，请重新输入");
                continue;
            }
            System.out.print("请确定是否需要删除" + b.getBname() + "店铺(请输入y&n)：");
            String ipp = sc.next();
            if (ipp.equalsIgnoreCase("y")) {
                boolean bl = abi.deleteBsn(bid);
                if (bl) {
                    System.out.println("删除成功！");
                    flag = false;
                } else {
                    System.out.println("删除失败!");
                }
            }else {
                flag=false;
            }
        }
    }
}
