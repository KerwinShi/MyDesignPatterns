package com.company.state;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/26 19:35
 * @Description:
 */
public abstract class State {
    public abstract void insertCoin();
    public abstract void ejectCoin();
    public abstract void turnCrank();
    public abstract void dispense();
}
