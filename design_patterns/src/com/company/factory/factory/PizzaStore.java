package com.company.factory.factory;

import com.company.factory.pizza.Pizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/16 16:55
 * @Description:
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        return creatPizza(type);
    };

    //利用继承实现创建对象is a
    public abstract Pizza creatPizza(String type);
}
