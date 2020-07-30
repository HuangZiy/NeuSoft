package com.neuedu.day_14.homework;

import com.neuedu.day_14.DBTool;

import java.sql.*;

public class JDBC {

    public void init(){
        DBTool dbTool = new DBTool();
    }

    public void insertUser(User u){
        Connection con = DBTool.getCon();
        PreparedStatement ps = null;
        String sql = "insert into user values(?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,u.getName());
            ps.setString(2,u.getPwd());
            ps.setString(3,u.getEmail());
            ps.setDate(4,u.getDate());
            int flag=ps.executeUpdate();
            if (flag>0){
                System.out.println("插入成功！");
            }else{
                System.out.println("插入失败！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
    }

    public void updateUser(User u){
        Connection con = DBTool.getCon();
        PreparedStatement ps = null;
        String sql = "update user set birthday=? where name=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setDate(1,u.getDate());
            ps.setString(2,u.getName());
            int flag = ps.executeUpdate();
            if (flag>0){
                System.out.println("更新成功！");
            }else{
                System.out.println("更新失败！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
    }

    public void deleteUser(User u){
        Connection con = DBTool.getCon();
        PreparedStatement ps = null;
        String sql = "delete from user where name=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,u.getName());
            int flag = ps.executeUpdate();
            if (flag>0){
                System.out.println("删除成功！");
            }else{
                System.out.println("删除失败！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
    }
}
