package com.neuedu.day_14;


import java.sql.*;

public class jdbcDemo02 {
    public static void main(String[] args) {

        Connection conn=DBTool.getCon();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "select * from emp";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                Date date = rs.getDate(5);
                double sal = rs.getDouble(6);
                double comm = rs.getDouble(7);
                int deptno = rs.getInt(8);
                System.out.println(empno+","+ename+","+job+","+mgr+","+date+","+sal+","+comm+","+deptno);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,conn);
        }
        }
}
