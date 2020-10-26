package com.company.factory.abstractfactory;

import com.company.factory.abstractfactory.pizza.PizzaOne;
import com.company.factory.pizza.Pizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 13:49
 * @Description:
 */
public class PizzaStoreOne implements PizzaStore {

    @Override
    public void creatPizza() {
        Pizza pizza = null;
        //利用组合实现创建对象has a
        PizzaFactroy pizzaFactroy = new PizzaFactoryOne();
        pizza = new PizzaOne(pizzaFactroy);
        pizza.display();

        System.out.println("creat a new pizza");

        pizzaFactroy = new PizzaFactoryTwo();
        pizza = new PizzaOne(pizzaFactroy);
        pizza.display();
    }
}
