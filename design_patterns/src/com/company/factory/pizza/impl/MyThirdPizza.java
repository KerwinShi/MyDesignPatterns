package com.company.factory.pizza.impl;

import com.company.factory.pizza.Pizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/15 21:01
 * @Description:
 */
public class MyThirdPizza implements Pizza {
    @Override
    public void display() {
        System.out.println("MyThirdPizza");
    }
}
