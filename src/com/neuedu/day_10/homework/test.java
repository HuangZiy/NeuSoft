package com.neuedu.day_10.homework;

public class test {
    public static boolean checkSymblo(String mail){
        boolean flag=true;
        for(int i=0;i<mail.length();i++){
            char e=mail.charAt(i);
            if(e>='0'&&e<='9'||e>='a'&&e<='z'||e=='@'||e=='.'){

            }else{
                flag=false;
                break;
            }
        }
        return flag;


    }

    public static boolean checkKey(String mail,char a,char b){
        boolean flag=true;
        boolean flag1=(mail.indexOf(a)==mail.lastIndexOf(a));
        boolean flag2=(mail.indexOf(b)==mail.lastIndexOf(b));
        return flag1&&flag2;
    }


    public static boolean checkOrder(String mail){
        boolean flag=true;
        for(int i=0;i<mail.length();i++){
            for(int j=0;j<mail.length();j++){
                System.out.println(mail.indexOf("@", i));
                if(mail.indexOf("@", i)==i&&mail.indexOf(".", j)==j&&j>i&&j!=i){

                }else{
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String mail="1969822321@qq.com";
        System.out.println(checkSymblo(mail));
        System.out.println(checkKey(mail, '@', '.'));
        System.out.println(checkOrder(mail));


        if(checkSymblo(mail)&&checkKey(mail, '@', '.')&&checkOrder(mail)){
            System.out.println("合法用户名");
            int position=mail.indexOf("@");
            String username=mail.substring(0,position);
            System.out.println(username);
            int po=mail.indexOf(".");
            String comname=mail.substring(position, po);
        }else{
            System.out.println("非法用户名");
        }
    }
}
