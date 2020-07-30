package com.neuedu.day_10.stringdemo;

public class StringTool {
    public boolean checkLength(String info){
        if (info.length()>=6){
            int len = info.length();
            return true;
        }else {
            return false;
        }
    }
    public boolean checkSymbol(String info){
        boolean flag = true;
        for (int i = 0; i <info.length() ; i++) {
            int ascii = info.charAt(i);
            if (!(ascii>=65&&ascii<=122||ascii>=97&&ascii<=122||ascii>=48&&ascii<=57)){
                flag=false;
                return flag;
            }
        }
        return flag;
    }

    public boolean cheeckEmail(String email){
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
        if (first_p>first_at){
            System.out.println("邮箱地址中.出现在@的前面");
            return false;
        }
        for (int i = 0; i < cs.length ; i++) {
            char c = cs[i];
            if ((c<'0'||c>'9')||(c<'A'||c>'Z')||(c<'a'||c>'z')){
                System.out.println("用户名里有其他字符");
                return false;
            }
        }
        return true;
    }


    public boolean cheeckIdNumber(String str){
        char[] nums = str.toCharArray();
        int len = nums.length;
        for (int i = 0; i < nums.length-1; i++) {   //判断除了最后一位的数字是否符合条件
            char c = nums[i];
            if (c<'0'||c>'9'){
                return false;
            }
        }
        int lastChar = nums[len-1];
        if ((lastChar>='0'&&lastChar<='9')||(lastChar=='X'&&len!=15)){
            return true;
        }
        return false;
    }
    public boolean cheeckId(String id){
        int len = id.length();
        if ((len==15||len==18)&&cheeckIdNumber(id)) {
            return true;
        }else{
            return false;
        }
    }

    public static String empSql(int dept,int sal,int comm) {
        StringBuffer sql;
        if (dept != 0 || sal != 0 || comm != 0) {
            sql = new StringBuffer("select * from emp where");
        } else {
            return "select * from emp";
        }
        if (dept != 0) {
            sql.append(" dept = "+dept);
        }
        if (sal != 0) {
            if (dept != 0) {
                sql.append(" and sal > "+sal);
            }else{
                sql.append(" sal > "+sal);
            }
        }
        if (comm != 0) {
            if (dept != 0 || sal != 0) {
                sql.append(" and comm > "+comm);
            }else{
                sql.append(" comm > "+comm);
            }
        }
        return sql.toString();
    }
}

