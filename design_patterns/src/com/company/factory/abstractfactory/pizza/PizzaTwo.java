package com.company.factory.abstractfactory.pizza;

import com.company.factory.abstractfactory.PizzaFactroy;
import com.company.factory.pizza.Pizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 13:56
 * @Description:
 */
public class PizzaTwo implements Pizza {
    PizzaFactroy pizzaFactroy = null;
    public PizzaTwo(PizzaFactroy pizzaFactroy) {
        this.pizzaFactroy = pizzaFactroy;
    }

    @Override
    public void display() {
        pizzaFactroy.creatPizzaMeteria();
    }
}
