package com.company.strategy;

import com.company.strategy.inteface.FlyBehaviour;
import com.company.strategy.inteface.QuackBehaviour;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/8/28 19:38
 * @Description:
 */
public abstract class Duck {
    //有一个
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public abstract void dislay();
    public abstract void performFly();
}
