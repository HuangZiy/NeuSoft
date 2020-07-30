package com.neuedu.day_14;

import java.sql.*;

public class DBTool {

    //    加载驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动已加载!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    //    建立连接
    public static Connection getCon(){
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/mysqldb?characterEncoding=UTF-8";
        String root = "root";
        String password = "hzy520";
        try {
            connection = DriverManager.getConnection(url,root,password);
            System.out.println("连接已建立！");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }


    //    关闭资源
    public static void close(ResultSet rs, PreparedStatement ps,Connection conn){

        try {
            if (rs!=null){
                rs.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (conn!=null){
                conn.close();
            }
            System.out.println("相关资源已关闭！");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(PreparedStatement ps,Connection conn){

        try {
            if (ps!=null){
                ps.close();
            }
            if (conn!=null){
                conn.close();
            }
            System.out.println("相关资源已关闭！");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
