package com.company.factory.abstractfactory;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 13:46
 * @Description:
 */
public class PizzaFactoryOne implements PizzaFactroy{
    @Override
    public void creatPizzaMeteria() {
        System.out.println("creat a meteria of pizza concrete 1");
    }
}
