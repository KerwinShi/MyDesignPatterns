package com.company.factory.factory;

import com.company.factory.pizza.Pizza;
import com.company.factory.pizza.impl.MyFourthPizza;
import com.company.factory.pizza.impl.MyThirdPizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/16 16:54
 * @Description:
 */
public class MyFirstPizzaStroe extends PizzaStore {

    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        if("myThirdPizza".equals(type) ){
            pizza = new MyThirdPizza();
        }else if("myFourthPizza".equals(type)){
            pizza = new MyFourthPizza();
        }
        return pizza;
    }
}
