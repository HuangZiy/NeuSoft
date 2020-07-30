package com.neuedu.day_15;

import com.neuedu.day_14.DBTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TransactionDemo02 {
    public static void main(String[] args) {
        Connection con= DBTool.getCon();
        PreparedStatement ps = null;
        Savepoint s1=null;
        Savepoint s2=null;
        Savepoint s3=null;
        try {
            con.setAutoCommit(false);
            String delete = "delete from myuser where uid=?";
            ps=con.prepareStatement(delete);
            ps.setString(1,"sunquan");
            ps.executeUpdate();

            s1=con.setSavepoint("s1");

            ps.setString(1,"zhaoyun");
            ps.executeUpdate();

            s2=con.setSavepoint("s2");


            ps.setString(1,"machao");
            ps.executeUpdate();

            s3=con.setSavepoint("s3");

            System.out.println(1/0);

            con.commit();
            System.out.println("已完成事务提交");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch (Exception e){
            try {
                System.out.println("出现异常，已进入事务回滚过程");
//                con.rollback();
                con.rollback(s1);
                con.setAutoCommit(true);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
