package com.neuedu.dao;

import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;

import java.util.List;

public interface AdminDao {
    Admin selectAdmin(Admin a);
    List<Admin> selectAll(Admin a);
    String selectAPwdByAAcc(String aacc);
    Admin selectAAcc(String aacc);
    int insertAdmin(Admin a);
    int updateAdmin(Admin a);
    List<Business> selectLike(Admin a,String pattern);
    int deleteBusiness(int b);

}
