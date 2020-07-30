package com.neuedu.day_15;

import com.neuedu.day_14.DBTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
    public static void main(String[] args) {
        Connection con= DBTool.getCon();
        PreparedStatement ps = null;
        try {
            con.setAutoCommit(false);
            String insert = "insert into myuser values(?,?,?)";
            ps=con.prepareStatement(insert);
            ps.setString(1,"sunquan");
            ps.setString(2,"123");
            ps.setString(3,"孙权");
            ps.executeUpdate();

            ps.setString(1,"zhaoyun");
            ps.setString(2,"123");
            ps.setString(3,"赵云");
            ps.executeUpdate();


            ps.setString(1,"machao");
            ps.setString(2,"123");
            ps.setString(3,"马超");
            ps.executeUpdate();

            con.commit();
            System.out.println("已完成事务提交");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch (Exception e){
            try {
                System.out.println("出现异常，已进入事务回滚过程");
                con.rollback();
                con.setAutoCommit(true);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
