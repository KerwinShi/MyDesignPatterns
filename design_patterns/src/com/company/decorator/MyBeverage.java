package com.company.decorator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/13 20:31
 * @Description:
 */
public class MyBeverage extends Beverage{
    public MyBeverage() {
        description = "MyBeverage";
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}
