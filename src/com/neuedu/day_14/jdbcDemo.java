package com.neuedu.day_14;


import java.sql.*;

public class jdbcDemo {
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
            while (rs.next()){
                int empno = rs.getInt(1);
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                double sal = rs.getDouble(6);
                double comm = rs.getDouble(7);
                int deptno = rs.getInt(8);
                System.out.println(empno+","+ename+","+job+","+mgr+","+sal+","+comm+","+deptno);
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
