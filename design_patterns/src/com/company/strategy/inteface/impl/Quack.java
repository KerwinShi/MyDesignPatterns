package com.company.strategy.inteface.impl;

import com.company.strategy.inteface.QuackBehaviour;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/8/28 19:43
 * @Description:接口具体实现类之一
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
