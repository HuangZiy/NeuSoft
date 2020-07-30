package com.neuedu.day_14.dao;

import com.neuedu.day_14.DBTool;
import com.neuedu.day_14.PoJo.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dao {
    public  void initJDBC(){
        DBTool dbTool = new DBTool();
    }

    public List<Emp> queryEmpAll(String sql){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Emp> list = new ArrayList<>();
        Emp emp;
        try {
            conn=DBTool.getCon();
            ps= conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                Date date = rs.getDate(5);
                double sal = rs.getDouble(6);
                double comm = rs.getDouble(7);
                int deptno = rs.getInt(8);
                emp = new Emp(empno,ename,job,mgr,sal,comm, (java.sql.Date) date,deptno);
                list.add(emp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
        return list;
    }


    public void login(String uid,String pwd){
        Connection conn=DBTool.getCon();
        PreparedStatement ps=null;
        ResultSet rs = null;
        String sql = "select * from myuser where uid=? and password=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,uid);
            ps.setString(2,pwd);
            rs=ps.executeQuery();
            if (rs.next()){
                String uid1 = rs.getString(1);
                String pwd1 = rs.getString(2);
                String realName1 = rs.getString(3);
                System.out.println("登录成功！\n用户真实姓名为："+realName1+"");
            }else{
                System.out.println("登录失败！");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
    }

    public void queryDept(int deptno){
        Connection conn=DBTool.getCon();
        PreparedStatement ps=null;
        ResultSet rs = null;
        String sql = "select * from dept where deptno=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1,deptno);
            rs = ps.executeQuery();
            if (rs.next()){
                int deptno1 = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                System.out.println("成功查找！");
                System.out.println(deptno1+","+dname+","+loc);
            }else{
                System.out.println("查找失败！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void insertEmp(Emp e){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        conn=DBTool.getCon();
        String sql = "insert into Emp values(?,?,?,?,?,?,?,?)";
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,e.getEmpno());
            ps.setString(2,e.getEname());
            ps.setString(3,e.getJob());
            ps.setInt(4,e.getMgr());
            ps.setDouble(6,e.getSal());
            ps.setDouble(7,e.getComm());
            ps.setDate(5,e.getDate());
            ps.setInt(8,e.getDeptno());
            int flag=ps.executeUpdate();
            if (flag==1){
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
    }

    public void updateEmp(Emp e){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        conn=DBTool.getCon();
        String sql = "update Emp set sal=? where empno=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(2,e.getEmpno());
            ps.setDouble(1,e.getSal());
            int flag=ps.executeUpdate();
            if (flag==1){
                System.out.println("更新成功");
            }else{
                System.out.println("更新失败");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
    }

    public void deleteEmp(Emp e){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        conn=DBTool.getCon();
        String sql = "delete FROM emp where empno=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setInt(1,e.getEmpno());
            int flag=ps.executeUpdate();
            if (flag==1){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
    }
}
