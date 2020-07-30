package com.neuedu.day_14;


import com.neuedu.day_14.PoJo.Dept;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC04 {
    public static void main(String[] args) {

        Connection conn=DBTool.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Dept dept = new Dept();
        List<Dept> list = new ArrayList<>();

        String sql = "select * from dept";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
            dept=new Dept(deptno,dname,loc);
            list.add(dept);
            }
            for (Dept d:list
                 ) {
                System.out.println(d);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
    }
}
