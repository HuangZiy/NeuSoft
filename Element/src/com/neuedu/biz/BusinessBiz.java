package com.neuedu.biz;

import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;

public interface BusinessBiz {
    Business businessInfo(Business b);
    boolean updateBusiness(Business b);
    boolean updatePwdBusiness(Business b);
//    boolean addBusiness(Admin a, Business b);
    boolean delBusiness(Business b);
    boolean checkLogin(String id,String pwd);
    Business getBusiness(String id);
    Business getBusiness(int id);
}
