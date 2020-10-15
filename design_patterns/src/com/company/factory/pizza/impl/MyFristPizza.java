package com.company.factory.pizza.impl;

import com.company.factory.pizza.Pizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/15 20:59
 * @Description:
 */
public class MyFristPizza implements Pizza {
    @Override
    public void display() {
        System.out.println("MyFristPizza");
    }
}
