package com.neuedu.view;

import com.neuedu.pojo.Business;

public interface BusinessView {
    void fristMenu(Business b);
    void secondMenu(Business b);
    void showInfo(Business b);
    void update(Business b);
    void updatePwd(Business b);
    void login();
    void showAllFood(Business b);
    void addFood(Business b);
    void updateFood();
    void deleteFood();
}
