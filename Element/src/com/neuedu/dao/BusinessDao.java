package com.neuedu.dao;

import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;

import java.util.List;

public interface BusinessDao {
    List<Business> selectBusinessAll(Admin a);
    Business selectBusiness(Business b);
    Business selectBusiness(int id);
    int updateBusiness(Business b);
    int insertBusiness(Admin a,Business b);
    String selectBPwdByBAcc(String bacc);
    Business selectBAcc(String bacc);
}
