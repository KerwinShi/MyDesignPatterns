package com.company.factory.abstractfactory;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 13:48
 * @Description:
 */
public class PizzaFactoryTwo implements PizzaFactroy{
    @Override
    public void creatPizzaMeteria() {
        System.out.println("creat a meteria of pizza concrete 2");
    }
}
