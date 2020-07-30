package com.neuedu.biz;

import com.neuedu.pojo.Business;
import com.neuedu.pojo.Food;

import java.util.List;

public interface FoodBiz {
    List<Food> showAll(Business b);
    boolean addFood(Business b, Food f);
    boolean updateFood(Food f,int fid);
    boolean delFood(Food f);
    Food selectById(int fid);
}
