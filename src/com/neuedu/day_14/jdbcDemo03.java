package com.neuedu.day_14;


import java.sql.*;

public class jdbcDemo03 {
    public static void main(String[] args) {

        Connection conn=DBTool.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from dept";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                int deptno = rs.getInt(1);
                String dname = rs.getString(2);
                String loc = rs.getString(3);
                System.out.println(deptno+","+dname+","+loc);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
    }
}
