package com.company.factory.simplefactory;

import com.company.factory.pizza.Pizza;
import com.company.factory.pizza.impl.MyFristPizza;
import com.company.factory.pizza.impl.MySecondPizza;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/15 20:55
 * @Description:分离变化的部分，new 对象的过程被提取出来
 */
public class SimpleFactory {
    public Pizza creatPizza(String type){
        Pizza pizza = null;
        if("myFristPizza".equals(type) ){
            pizza = new MyFristPizza();
        }else if("mySecondPizza".equals(type)){
            pizza = new MySecondPizza();
        }
        return pizza;
    }
}
