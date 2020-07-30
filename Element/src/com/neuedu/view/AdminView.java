package com.neuedu.view;

import com.neuedu.pojo.Admin;
import com.neuedu.pojo.Business;

public interface AdminView {
    void login();
    void regisBsn(Admin a);
    void Menu(Admin a);
    void showAll(Admin a);
    void likeBsn(Admin a);
    void deleteBsn();

}
