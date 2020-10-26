package com.company.adapter;

import com.company.strategy.Duck;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 15:49
 * @Description:
 */
public class TurkeyAdapter extends Duck {
    Turkey turkey = null;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void dislay() {
        turkey.dislay();
    }

    @Override
    public void performFly() {
        turkey.performFly();
    }
}
