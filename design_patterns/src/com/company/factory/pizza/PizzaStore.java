package com.company.factory.pizza;

import com.company.factory.simplefactory.SimpleFactory;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/15 21:05
 * @Description:
 */
public class PizzaStore {
    SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = null;
        pizza = simpleFactory.creatPizza(type);
        pizza.display();
        return pizza;
    }
}
