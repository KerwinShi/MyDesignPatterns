package com.company.state.concretesatets;

import com.company.state.GumBallMachine;
import com.company.state.State;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/26 19:39
 * @Description:
 */
public class SoldOutState extends State {
    GumBallMachine gumBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("meaningless operation");
    }

    @Override
    public void ejectCoin() {
        System.out.println("meaningless operation");
    }

    @Override
    public void turnCrank() {
        System.out.println("meaningless operation");
    }

    @Override
    public void dispense() {
        System.out.println("meaningless operation");
    }
}
