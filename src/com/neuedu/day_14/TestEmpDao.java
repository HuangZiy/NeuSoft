package com.neuedu.day_14;

import com.neuedu.day_14.PoJo.Emp;
import com.neuedu.day_14.dao.Dao;

import java.sql.Date;
import java.util.Calendar;

public class TestEmpDao {
    public static void main(String[] args) {
        Dao empDao =new Dao();
        Calendar calendar = Calendar.getInstance();
        java.util.Date d1 = calendar.getTime();
        Date date = new Date(d1.getTime());
        Emp e = new Emp(1001,"小黄","董事长",0,10000,1000,date,10);
//        List<Emp> list = new ArrayList<>();
//        String sql = "select * from emp";
//        empDao.initJDBC();
//        list=empDao.queryEmpAll(sql);
//        for (Emp e:list
//             ) {
//            System.out.println(e);
//        }
        empDao.initJDBC();

//        empDao.queryDept(20);
//        empDao.insertEmp(e);
//       e.setSal(80000);
//       empDao.updateEmp(e);
        empDao.deleteEmp(e);
    }
}
