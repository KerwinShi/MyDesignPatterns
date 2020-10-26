package com.company.state.concretesatets;

import com.company.state.GumBallMachine;
import com.company.state.State;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/26 19:39
 * @Description:
 */
public class WinnerState extends State {
    GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
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
        System.out.println("congratulations，winner");
        gumBallMachine.realseBall();
        if (gumBallMachine.getCount()==0){
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }else {
            gumBallMachine.realseBall();
            System.out.println("free gumball for you");
            if (gumBallMachine.getCount()>0){
                gumBallMachine.setState(gumBallMachine.getNoCoinState());
            }else {
                System.out.println("oops, sold out");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        }
    }
}
