package com.neuedu.biz;

import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;

import java.util.List;

public interface AdminBiz {
    void showAdm(Admin a);
    List<Business> showAll(Admin a);
    boolean checkLogin(String id,String pwd);
    boolean regisBsn(Admin a,Business b);
    boolean regisAdm(Admin a);
    Admin getAdmin(String id);
    List<Business> showLike(Admin a,String pattern);
    boolean deleteBsn(int bacc);
}
