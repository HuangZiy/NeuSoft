package com.neuedu.day_10.stringdemo;

import static com.neuedu.day_10.stringdemo.StringTool.empSql;

public class StringDemo03 {
    public static void main(String[] args) {
        String uid = "Alexander1";
        String email = "1141269713@qq.com";
        StringTool st = new StringTool();
        String id = "a40881199812452231";
        String id2 = "123456789012345";
//        if (st.checkLength(uid)) {
//            System.out.println("合法");
//        } else {
//            System.out.println("长度低于6个字符，需要重新命名");
//        }
//        char first = uid.charAt(0);
//        char last = uid.charAt(uid.length()-1);
//        if (st.checkSymbol(uid))
//            System.out.println("合法字符");
//        else{
//            System.out.println("非法字符");
//        }
//        if (st.cheeckEmail(email))
//            System.out.println("合法emali");
//        else{
//            System.out.println("非法emali");
//        }
//        if (st.cheeckId(id2))
//            System.out.println("合法身份证");
//        else {
//            System.out.println("非法身份证");
//        }
        int startIndex = email.indexOf('@')+1;
        int lastIndex = email.indexOf('.');
        System.out.println(startIndex+","+lastIndex);
        String compey = email.substring(startIndex,lastIndex);
        System.out.println(compey);
    }
}
