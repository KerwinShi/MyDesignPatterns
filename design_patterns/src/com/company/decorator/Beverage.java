package com.company.decorator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/13 20:25
 * @Description:咖啡店最基本的抽象类
 */
public abstract class Beverage {
    public String description = "initial decsription";

    public String getDescription(){
        return this.description;
    }

    public abstract Double cost();
}
