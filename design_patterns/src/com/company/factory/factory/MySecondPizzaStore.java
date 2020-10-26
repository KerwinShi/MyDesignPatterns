package com.company.factory.factory;

import com.company.factory.pizza.Pizza;
import com.company.factory.pizza.impl.MyFristPizza;
import com.company.factory.pizza.impl.MySecondPizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/16 16:59
 * @Description:
 */
public class MySecondPizzaStore extends PizzaStore{
    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        if("myFristPizza".equals(type) ){
            pizza = new MyFristPizza();
        }else if("mySecondPizza".equals(type)){
            pizza = new MySecondPizza();
        }
        return pizza;
    }
}

