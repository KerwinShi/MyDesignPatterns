package com.company.adapter;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 15:47
 * @Description:
 */
public class WildTurkey implements Turkey{
    @Override
    public void dislay() {
        System.out.println("i am a wildturkey");
    }

    @Override
    public void performFly() {
        System.out.println("i can fly, but little distance");
    }
}
