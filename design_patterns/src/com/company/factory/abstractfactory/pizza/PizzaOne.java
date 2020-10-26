package com.company.factory.abstractfactory.pizza;

import com.company.factory.abstractfactory.PizzaFactroy;
import com.company.factory.pizza.Pizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 13:53
 * @Description:
 */
public class PizzaOne implements Pizza {
    PizzaFactroy pizzaFactroy = null;
    public PizzaOne(PizzaFactroy pizzaFactroy) {
        this.pizzaFactroy = pizzaFactroy;
    }

    @Override
    public void display() {
        pizzaFactroy.creatPizzaMeteria();
    }
}
