package com.company.decorator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/13 20:33
 * @Description:
 */
public class MyCondiment extends Condiment{
    Beverage beverage;

    public MyCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + MyCondiment";
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.66;
    }
}
