package com.neuedu.biz.impl;

import com.neuedu.biz.FoodBiz;
import com.neuedu.dao.impl.Dao;
import com.neuedu.pojo.Business;
import com.neuedu.pojo.Food;

import java.util.List;

public class FoodBizImpl implements FoodBiz {
    private Dao dao;
    public FoodBizImpl(){
        dao=new Dao();
    }
    @Override
    public List<Food> showAll(Business b) {
        return dao.selectFood(b);
    }

    @Override
    public boolean addFood(Business b, Food f) {
        int flag=dao.insertFood(b,f);
        if (flag>=1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateFood(Food f,int fid) {
        if (dao.updateFood(f,fid)>=1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean delFood(Food f) {
        if (dao.deleteFood(f)>=1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Food selectById(int fid) {
        return dao.selectFoodByFid(fid);
    }
}
