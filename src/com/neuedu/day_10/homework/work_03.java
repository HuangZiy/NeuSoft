package com.neuedu.day_10.homework;

import java.util.Scanner;

public class work_03 {
    public static boolean cheeckEmail(String email){
        int first_p = email.indexOf('.');
        int last_p = email.lastIndexOf('.');
        int first_at = email.indexOf('@');
        int last_at = email.lastIndexOf('@');
        char [] cs = email.toCharArray();
        if (first_at==-1||first_p==-1){
            System.out.println("邮箱地址中不包含@或.　");
            return false;
        }
        if (first_p!=last_p&&first_at!=last_at){
            System.out.println("邮箱地址中含有多了@或.　");
            return false;
        }
        if (first_p<first_at){
            System.out.println("邮箱地址中.出现在@的前面");
            return false;
        }
        for (int i = 0; i < email.indexOf("@") ; i++) {
            char c = cs[i];
            if ((c<'0'||c>'9')&&(c<'A'||c>'Z')&&(c<'a'||c>'z')){
                System.out.println("用户名里有其他字符");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        if (cheeckEmail(email)){
            System.out.println("合法邮箱用户名："+email.substring(0,email.indexOf("@")));
            System.out.println("合法邮箱域名："+email.substring(email.indexOf("@")+1));
        }
    }

}
