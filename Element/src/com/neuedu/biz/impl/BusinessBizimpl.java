package com.neuedu.biz.impl;

import com.neuedu.biz.BusinessBiz;
import com.neuedu.dao.impl.Dao;
import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;

public class BusinessBizimpl implements BusinessBiz {
    private Dao dao;
    public BusinessBizimpl(){
        dao=new Dao();
    }

    @Override
    public Business businessInfo(Business b) {
        Business b1 = dao.selectBusiness(b);
        return b1;
    }

    @Override
    public boolean updateBusiness(Business b) {
        if (dao.updateBusiness(b)>=1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updatePwdBusiness(Business b) {
        if (dao.updateBusiness(b)>=1){
            return true;
        }else {
            return false;
        }
    }

//    @Override
//    public boolean addBusiness(Admin a, Business b) {
//        return false;
//    }

    @Override
    public boolean delBusiness(Business b) {
        return false;
    }

    @Override
    public boolean checkLogin(String id, String pwd) {
        String pwd1=dao.selectBPwdByBAcc(id);
//        Business b = dao.selectBAcc(id);
        return pwd1.equals(pwd);
    }

    @Override
    public Business getBusiness(String id) {
        return dao.selectBAcc(id);
    }
    @Override
    public Business getBusiness(int id) {
        return dao.selectBusiness(id);
    }
}
