package com.neuedu.view.impl;

import com.neuedu.biz.impl.AdminBizImpl;
import com.neuedu.biz.impl.BusinessBizimpl;
import com.neuedu.biz.impl.FoodBizImpl;
import com.neuedu.pojo.Business;
import com.neuedu.pojo.Food;
import com.neuedu.view.BusinessView;

import java.util.List;
import java.util.Scanner;

public class BusinessViewImpl implements BusinessView {
    BusinessBizimpl bbi;
    AdminBizImpl abi;
    FoodBizImpl fbi;

    public BusinessViewImpl() {
        bbi = new BusinessBizimpl();
        abi = new AdminBizImpl();
        fbi = new FoodBizImpl();
    }

    @Override
    public void fristMenu(Business b) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
            System.out.println("|一一一一一一一一一一一一第一级菜单一一一一一一一一一一一一一|");
            System.out.println("|一一1.查看商家信息一一一一一一一一一2.修改商家信息 一一一一|");
            System.out.println("|一一3.更新密码一一一一一一一一一一一4.食物管理一一一一一一一|");
            System.out.println("|一一一一一一一一一一一一 0.退出一一一一一一一一一一一一一一|");
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
            System.out.print("请选择你的选择(0~4的整数)：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showInfo(b);
                    break;
                case 2:
                    update(b);
                    break;
                case 3:
                    updatePwd(b);
                    break;
                case 4:
                    secondMenu(b);
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
    public void secondMenu(Business b) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
            System.out.println("|一一一一一一一一一一一一第二级菜单一一一一一一一一一一一一一|");
            System.out.println("|一一1.查看食品列表一一一一一一一一一2.新增食品 一一一一一一|");
            System.out.println("|一一3.修改食品 一一一一一一一一一一4.删除食品一一一一一一一|");
            System.out.println("|一一一一一一一一一一 0.返回上一级一一一一一一一一一一一一一|");
            System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
            System.out.print("请选择你的选择(0~4的整数)：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showAllFood(b);
                    break;
                case 2:
                    addFood(b);
                    break;
                case 3:
                    updateFood();
                    break;
                case 4:
                    deleteFood();
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
    public void showInfo(Business b1) {
        Business b = bbi.businessInfo(b1);
        int bid = b.getBid();
        String bname = b.getBname();
        String baddress = b.getBaddress();
        String binfo = b.getBinfo();
        double bsf = b.getBsf();
        double bdf = b.getBdf();
        System.out.println("==================================================");
        System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
        System.out.println("一一一一一一一一商家编号：" + bid);
        System.out.println("一一一一一一一一商家名称：" + bname);
        System.out.println("一一一一一一一一商家地址：" + baddress);
        System.out.println("一一一一一一一一商家介绍：" + binfo);
        System.out.println("一一一一一一一一商家起送费：" + bsf);
        System.out.println("一一一一一一一一商家配送费：" + bdf);
        System.out.println(" 一一一一一一一一一一一一一一一一一一一一一一一一一一一一一一 ");
        System.out.println("==================================================");
    }

    @Override
    public void update(Business b) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("是否修改商家名称(请输入y&n)：");
            if (sc.nextLine().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setBname(sc.nextLine());
                flag = false;
            }
            System.out.println("是否修改商家地址(请输入y&n)：");
            if (sc.nextLine().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setBaddress(sc.nextLine());
                flag = false;
            }
            System.out.println("是否修改商家介绍(请输入y&n)：");
            if (sc.nextLine().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setBinfo(sc.nextLine());
                flag = false;
            }
            System.out.println("是否修改商家起送费(请输入y&n)：");
            if (sc.nextLine().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setBsf(sc.nextDouble());
                flag = false;
            }
            System.out.println("是否修改商家配送费(请输入y&n)：");
            if (sc.nextLine().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setBdf(sc.nextDouble());
                flag = false;
            }
            boolean isUpdate = bbi.updateBusiness(b);
            if (flag){
                System.out.println("修改已退出");
                break;
            }
            if (isUpdate) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败，请重新修改！");
                flag=true;
            }
        }
    }

    @Override
    public void updatePwd(Business b) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("是否修改商家密码(请输入y&n)：");
        String ip = sc.nextLine();
        while (flag && ip.equalsIgnoreCase("y")) {
            System.out.print("请输入现在的密码：");
            String bpwd = sc.nextLine();
            String bacc = b.getBacc();
            if (bbi.checkLogin(bacc, bpwd)) {
                System.out.print("请输入修改的密码：");
                String pwd1 = sc.nextLine();
                System.out.print("请再次输入修改的密码：");
                String pwd2 = sc.nextLine();
                boolean isUpdate = false;
                if (pwd1.equals(pwd2)) {
                    b.setPwd(pwd1);
                    isUpdate = bbi.updateBusiness(b);
                }
                if (isUpdate) {
                    System.out.println("修改成功");
                    flag = false;
                } else {
                    System.out.println("修改失败，请重新修改！");
                }
            } else {
                System.out.println("输入出错请重新输入！");
            }
        }
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
            } else if (bbi.checkLogin(id, pwd)) {
                System.out.println("登录成功");
                Business b = bbi.getBusiness(id);
                fristMenu(b);
                flag = false;
            } else {
                System.out.println("登录失败,请重新输入账户密码");
                continue;
            }
        }
    }

    @Override
    public void showAllFood(Business b) {
        List<Food> flist;
        flist = fbi.showAll(b);
        for (Food f : flist
        ) {
            System.out.println(f);
        }
    }

    @Override
    public void addFood(Business b) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入食品名称：");
            String fname = sc.nextLine();
            System.out.println("请输入食品介绍：");
            String finfo = sc.nextLine();
            System.out.println("请输入食品价格：");
            double fprice = sc.nextDouble();
            Food f = new Food(fname, finfo, fprice);
            if (fbi.addFood(b, f)) {
                System.out.println("添加成功！");
                flag = false;
            } else {
                System.out.println("添加失败！请重新填写信息！");
            }
        }
    }

    @Override
    public void updateFood() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("请输入需要修改的食品编号：");
            int fid = sc.nextInt();
            Food b = fbi.selectById(fid);
            if (b==null){
                continue;
            }
            System.out.println("是否修改食品名称(请输入y&n)：");
            if (sc.next().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setFname(sc.nextLine());
                flag = false;
            }
            System.out.println("是否修改食品介绍(请输入y&n)：");
            if (sc.next().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setFinfo(sc.nextLine());
                flag = false;
            }
            System.out.println("是否修改食品价格(请输入y&n)：");
            if (sc.next().equals("y")) {
                System.out.print("请输入修改信息：");
                b.setFprice(sc.nextDouble());
                flag = false;
            }
            if (flag){
                System.out.println("修改已退出");
                break;
            }
            boolean isUpdate = fbi.updateFood(b, fid);
            if (isUpdate) {
                System.out.println("修改成功");
            } else {
                flag = true;
                System.out.println("修改失败，请重新修改！");
            }
        }
    }

    @Override
    public void deleteFood() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("是否需要删除食品(请输入y&n)：");
            String ip = sc.next();
            if (ip.equalsIgnoreCase("y")) {
                System.out.print("请输入需要删除的食品的编号：");
                int fid = sc.nextInt();
                Food b = fbi.selectById(fid);
                if (b==null){
                    continue;
                }
                System.out.print("请确定是否需要删除" + b.getFname() + "食品(请输入y&n)：");
                String ipp = sc.next();
                if (ipp.equalsIgnoreCase("y")) {
                    boolean bl = fbi.delFood(b);
                    if (bl) {
                        System.out.println("删除成功！");
                        flag = false;
                    } else {
                        System.out.println("删除失败!");
                    }
                }
            }else {
                break;
            }
        }
    }
}
