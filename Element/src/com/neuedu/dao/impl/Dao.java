package com.neuedu.dao.impl;

import com.neuedu.dao.AdminDao;
import com.neuedu.dao.BusinessDao;
import com.neuedu.dao.FoodDao;
import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;
import com.neuedu.pojo.Food;
import com.neuedu.util.DBTool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao implements AdminDao, BusinessDao, FoodDao {
    //构造方法初始化
    public Dao(){
        DBTool dbTool = new DBTool();
    }

    //查询指定管理员表
    @Override
    public Admin selectAdmin(Admin a) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String selectAdmin="select * from admin where aacc=?";
        try {
            ps=con.prepareStatement(selectAdmin);
            ps.setString(1,a.getAacc());
            rs=ps.executeQuery();
            rs.next();
            String aacc=rs.getString("aacc");
            String pwd=rs.getString("pwd");
            String aname=rs.getString("aname");
            Admin admin = new Admin(aacc,pwd,aname);
            return admin;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }

    //查询所有管理员表
    @Override
    public List<Admin> selectAll(Admin a) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        List<Admin> admins = new ArrayList<>();
        String selectAdmin="select * from admin where aacc=?";
        try {
            ps=con.prepareStatement(selectAdmin);
            ps.setString(1,a.getAacc());
            rs=ps.executeQuery();
            while (rs.next()){
                String aacc=rs.getString("aacc");
                String pwd=rs.getString("pwd");
                String aname=rs.getString("aname");
                Admin admin = new Admin(aacc,pwd,aname);    admins.add(admin);
            }
            return admins;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }

    //根据用户名查找密码
    @Override
    public String selectAPwdByAAcc(String aacc) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String sql="select * from admin where aacc=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,aacc);
            rs=ps.executeQuery();
            rs.next();
            String pwd=rs.getString("apwd");
            return pwd;
        } catch (SQLException throwables) {
            System.out.println("账户不存在");
            return "";
        }catch (NullPointerException e){
            System.out.println("账户不存在");
            return "";
        }finally{
            DBTool.close(rs,ps,con);
        }
    }

    //根据用户名查询信息
    @Override
    public Admin selectAAcc(String aacc) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String selectAdmin="select * from admin where aacc=?";
        try {
            ps=con.prepareStatement(selectAdmin);
            ps.setString(1,aacc);
            rs=ps.executeQuery();
            rs.next();
            int aid=rs.getInt("aid");
            String aacc1=rs.getString("aacc");
            String pwd=rs.getString("apwd");
            String aname=rs.getString("aname");
            Admin admin = new Admin(aid,aacc1,pwd,aname);
            return admin;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }

    //插入一个管理员
    @Override
    public int insertAdmin(Admin a) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="insert into admin(apwd,aname,aacc) values(?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,a.getApwd());
            ps.setString(2,a.getAname());
            ps.setString(3,a.getAacc());
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }
    //修改管理员信息
    @Override
    public int updateAdmin(Admin a) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="update business set aacc=?,apwd=?,aname=? where aid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,a.getAacc());
            ps.setString(2,a.getApwd());
            ps.setString(3,a.getAname());
            ps.setInt(4,a.getAid());
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }
    //模糊查找店铺名
    @Override
    public List<Business> selectLike(Admin a, String pattern) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        List<Business> blist = new ArrayList<>();
        String selectAdmin="select * from business where bname like ?";
        try {
            ps=con.prepareStatement(selectAdmin);
            ps.setString(1,pattern);
            rs=ps.executeQuery();
            while (rs.next()){
                int bid = rs.getInt("bid");
                String bacc=rs.getString("bacc");
                String pwd=rs.getString("pwd");
                String bname=rs.getString("bname");
                String baddress=rs.getString("baddress");
                String binfo=rs.getString("binfo");
                double bsf=rs.getDouble("bsf");
                double bdf=rs.getDouble("bdf");
                Business b = new Business(bid,bacc,pwd,bname,baddress,binfo,bsf,bdf);
                blist.add(b);
            }
            return blist;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return blist;
    }

    //根据一个管理员查看其管理的所有店铺的信息
    @Override
    public List<Business> selectBusinessAll(Admin a) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        List<Business> blist = new ArrayList<>();
        String selectAdmin="select * from business where aid=?";
        try {
            ps=con.prepareStatement(selectAdmin);
            ps.setInt(1,a.getAid());
            rs=ps.executeQuery();
            while (rs.next()){
                int bid = rs.getInt("bid");
                String bacc = rs.getString("bacc");
                String pwd = rs.getString("pwd");
                String bname = rs.getString("bname");
                String baddress = rs.getString("baddress");
                String binfo = rs.getString("binfo");
                double bsf = rs.getDouble("bsf");
                double bdf = rs.getDouble("bdf");
                Business b = new Business(bid, bacc, pwd, bname, baddress, binfo, bsf, bdf);
                blist.add(b);
            }
            return blist;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }

    //根据对象查询一个店铺的信息
    @Override
    public Business selectBusiness(Business b) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String sql="select * from business where bacc=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,b.getBacc());
            rs=ps.executeQuery();
            rs.next();
            int id = rs.getInt("bid");
            String bacc=rs.getString("bacc");
            String pwd=rs.getString("pwd");
            String bname=rs.getString("bname");
            String baddress=rs.getString("baddress");
            String binfo=rs.getString("binfo");
            double bsf=rs.getDouble("bsf");
            double bdf=rs.getDouble("bdf");
            Business b1 = new Business(id,bacc,pwd,bname,baddress,binfo,bsf,bdf);
            return b1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }
    //根据id查询一个店铺的信息
    @Override
    public Business selectBusiness(int id) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String sql="select * from business where bid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            rs=ps.executeQuery();
            rs.next();
            String bacc=rs.getString("bacc");
            String pwd=rs.getString("pwd");
            String bname=rs.getString("bname");
            String baddress=rs.getString("baddress");
            String binfo=rs.getString("binfo");
            double bsf=rs.getDouble("bsf");
            double bdf=rs.getDouble("bdf");
            Business b1 = new Business(bacc,pwd,bname,baddress,binfo,bsf,bdf);
            return b1;
        } catch (SQLException throwables) {
            System.out.println("该编号不存在");
            return null;
        }finally {
            DBTool.close(rs,ps,con);
        }
    }

    //修改店铺信息
    @Override
    public int updateBusiness(Business b) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="update business set pwd=?,bname=?,baddress=?,binfo=?,bsf=?,bdf=? where bid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,b.getPwd());
            ps.setString(2,b.getBname());
            ps.setString(3,b.getBaddress());
            ps.setString(4,b.getBinfo());
            ps.setDouble(5,b.getBsf());
            ps.setDouble(6,b.getBdf());
            ps.setInt(7,b.getBid());
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }

    //插入一个店铺信息
    @Override
    public int insertBusiness(Admin a,Business b) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="insert into business(bacc,pwd,bname,aid) values(?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,b.getBacc());
            ps.setString(2,b.getPwd());
            ps.setString(3,b.getBname());;
            ps.setInt(4,a.getAid());
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }
//    @Override
//    public int insertBusiness(Admin a,Business b) {
//        Connection con=DBTool.getCon();
//        PreparedStatement ps=null;
//        int flag = -1;
//        String sql="insert into business(bacc,pwd,bname,baddress,binfo,bsf,bdf,aid) values(?,?,?,?,?,?,?,?)";
//        try {
//            ps=con.prepareStatement(sql);
//            ps.setString(1,b.getBacc());
//            ps.setString(2,b.getPwd());
//            ps.setString(3,b.getBname());
//            ps.setString(4,b.getBaddress());
//            ps.setString(5,b.getBinfo());
//            ps.setDouble(6,b.getBsf());
//            ps.setDouble(7,b.getBdf());
//            ps.setInt(8,a.getAid());
//            flag=ps.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }finally {
//            DBTool.close(ps,con);
//        }
//        return flag;
//    }

    //删除一个店铺
    @Override
    public int deleteBusiness(int b) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String deleteBusiness="delete from business where bid=?";
        try {
            ps=con.prepareStatement(deleteBusiness);
            ps.setInt(1,b);
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }

    //根据店铺账户查找密码
    @Override
    public String selectBPwdByBAcc(String bacc) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String sql="select * from business where bacc=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,bacc);
            rs=ps.executeQuery();
            rs.next();
            String pwd=rs.getString("pwd");
            return pwd;
        } catch (SQLException throwables) {
            System.out.println("账户不存在");
            return "";
        }catch (NullPointerException e){
            System.out.println("账户不存在");
            return "";
        }finally {
            DBTool.close(rs,ps,con);
        }
    }

    //查询一个店铺
    @Override
    public Business selectBAcc(String bacc1) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String sql="select * from business where bacc=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,bacc1);
            rs=ps.executeQuery();
            rs.next();
            int bid = rs.getInt("bid");
            String bacc=rs.getString("bacc");
            String pwd=rs.getString("pwd");
            String bname=rs.getString("bname");
            String baddress=rs.getString("baddress");
            String binfo=rs.getString("binfo");
            double bsf=rs.getDouble("bsf");
            double bdf=rs.getDouble("bdf");
            Business b1 = new Business(bid,bacc,pwd,bname,baddress,binfo,bsf,bdf);
            return b1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }

    //根据对象查询一家店铺的食品
    @Override
    public List<Food> selectFood(Business b) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        List<Food> flist = new ArrayList<>();
        String sql="select * from food where bid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,b.getBid());
            rs=ps.executeQuery();
            while (rs.next()){
                int fid = rs.getInt("fid");
                String fname=rs.getString("fname");
                String finfo=rs.getString("finfo");
                double price=rs.getDouble("fprice");
                Food f = new Food(fid,fname,finfo,price);
                flist.add(f);
            }
            return flist;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }
    //根据店铺id查询店铺的食品
    @Override
    public List<Food> selectFood(int bid) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        List<Food> flist = new ArrayList<>();
        String sql="select * from food where bid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,bid);
            rs=ps.executeQuery();
            while (rs.next()){
                String fname=rs.getString("bname");
                String finfo=rs.getString("binfo");
                double price=rs.getDouble("fprice");
                Food f = new Food(fname,finfo,price);
                flist.add(f);
            }
            return flist;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(rs,ps,con);
        }
        return null;
    }

    @Override
    public Food selectFoodByFid(int fid) {
        Connection con=DBTool.getCon();
        ResultSet rs=null;
        PreparedStatement ps=null;
        String sql="select * from food where fid=?";
        System.out.println(fid);
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,fid);
            rs=ps.executeQuery();
            rs.next();
            int fid1 = rs.getInt("fid");
                String fname=rs.getString("fname");
                String finfo=rs.getString("finfo");
                double price=rs.getDouble("fprice");
                Food f = new Food(fid,fname,finfo,price);
            return f;
        } catch (SQLException throwables) {
            System.out.println("输入的食品编号不正确，请重新输入");
            return null;
        }finally {
            DBTool.close(rs,ps,con);
        }
    }

    //修改一个食品信息
    @Override
    public int updateFood(Food  f,int fid) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="update food set fname=?,finfo=?,fprice=? where fid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,f.getFname());
            ps.setString(2,f.getFinfo());
            ps.setDouble(3,f.getFprice());
            ps.setInt(4,fid);
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }

    //增加一个食品
    @Override
    public int insertFood(Business b,Food f) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="insert into food(fname,finfo,fprice,bid) values(?,?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,f.getFname());
            ps.setString(2,f.getFinfo());
            ps.setDouble(3,f.getFprice());
            ps.setInt(4,b.getBid());
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }

    //删除一个食品
    @Override
    public int deleteFood(Food f) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="delete from food where fid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,f.getFid());
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }
    //id删除一个食品
    @Override
    public int deleteFood(int f) {
        Connection con=DBTool.getCon();
        PreparedStatement ps=null;
        int flag = -1;
        String sql="delete from food where fid=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,f);
            flag=ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DBTool.close(ps,con);
        }
        return flag;
    }
}
