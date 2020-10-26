package com.company.combination;

import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/20 10:45
 * @Description:
 */
public class MenuItem extends MenuComponent {
    //名称
    String name;
    //描述
    String description;
    //是否为素食
    boolean vegetarian;
    //价格
    double price;

    public MenuItem( String name, String description,boolean vegetarian,double price){
        this.name=name;
        this.description=description;
        this.vegetarian=vegetarian;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.println("........."+getName());
        if (isVegetarian()){
            System.out.println("(v)");
        }
        System.out.println(","+getPrice());
        System.out.println(" --"+getDescription());
    }

    public Iterator createIterator(){
        return new NullIterator();
    }
}
