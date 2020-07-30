package com.neuedu.dao;

import com.neuedu.pojo.Business;
import com.neuedu.pojo.Food;

import java.util.List;

public interface FoodDao {
    List<Food> selectFood(Business b);
    List<Food> selectFood(int bid);
    Food selectFoodByFid(int fid);
    int updateFood(Food f,int fid);
    int insertFood(Business b,Food f);
    int deleteFood(Food f);
    int deleteFood(int f);
}
