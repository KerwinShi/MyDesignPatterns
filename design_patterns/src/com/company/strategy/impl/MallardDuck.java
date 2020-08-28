package com.company.strategy.impl;

import com.company.strategy.Duck;
import com.company.strategy.inteface.FlyBehaviour;
import com.company.strategy.inteface.impl.FlyWithWings;
import com.company.strategy.inteface.impl.Quack;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/8/28 19:49
 * @Description:
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();//构造的时候才指定具体是那一个飞行能力实现类
        this.quackBehaviour = new Quack();//构造的时候才指定具体是那一个发声能力实现类
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        this.flyBehaviour = fb;//运行的时候都可以动态改变飞行能力实现类
    }

    @Override
    public void dislay() {
        System.out.println("MallardDuck");
    }

    @Override
    public void performFly() {
        flyBehaviour.fly();
    }
}
