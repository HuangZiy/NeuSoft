package com.neuedu.day_14;

import com.neuedu.day_14.PoJo.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestJDBC03 {

        public static void main(String[] args) {
            ResultSet rs = null;
            Connection conn= null;
            PreparedStatement ps= null;
            try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/justdb?characterEncoding=UTF-8","root","hzy520");
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("驱动成功加载！");
                conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldb?characterEncoding=UTF-8","root","hzy520");
                String sql = "select * from emp";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                List<Emp> list = new ArrayList<>();
                Emp emp=new Emp();
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
                for (Emp e:list
                     ) {
                    System.out.println(e);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    if (rs!=null)
                        rs.close();
                    if (ps!=null)
                        ps.close();
                    if (conn!=null)
                        conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
    }

