package com.company.strategy.inteface.impl;

import com.company.strategy.inteface.FlyBehaviour;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/8/28 19:42
 * @Description:接口具体实现类之一
 */
public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("FlyNoWay");
    }
}
