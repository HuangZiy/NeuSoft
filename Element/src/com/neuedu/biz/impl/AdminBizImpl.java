package com.neuedu.biz.impl;

import com.neuedu.biz.AdminBiz;
import com.neuedu.dao.impl.Dao;
import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;

import java.util.List;

public class AdminBizImpl implements AdminBiz {
        private Dao dao;
        public AdminBizImpl(){
            dao=new Dao();
        }

    @Override
    public void showAdm(Admin a) {

    }

    @Override
    public List<Business> showAll(Admin a) {
        return dao.selectBusinessAll(a);
    }

    @Override
    public boolean checkLogin(String id, String pwd) {
        String pwd1=dao.selectAPwdByAAcc(id);
//        Admin a = dao.selectAAcc(id);
        return pwd1.equals(pwd);
    }

    @Override
    public boolean regisBsn(Admin a, Business b) {
        int flag=dao.insertBusiness(a,b);
        if (flag>=1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean regisAdm(Admin a) {
        return false;
    }

    @Override
    public Admin getAdmin(String id) {
        return dao.selectAAcc(id);
    }

    @Override
    public List<Business> showLike(Admin a, String pattern) {
        return dao.selectLike(a,pattern);
    }

    @Override
    public boolean deleteBsn(int bacc) {
        int flag=dao.deleteBusiness(bacc);
        if (flag>=1){
            return true;
        }else {
            return false;
        }
    }
}
