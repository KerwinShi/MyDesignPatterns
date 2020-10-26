package com.company.state.concretesatets;

import com.company.state.GumBallMachine;
import com.company.state.State;

import java.util.Random;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/26 19:38
 * @Description:
 */
public class HasCoinState extends State {
    GumBallMachine gumBallMachine;
    Random randomWinner = new Random(System.currentTimeMillis());
    public HasCoinState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertCoin() {
        System.out.println("meaningless operation");
    }

    @Override
    public void ejectCoin() {
        System.out.println("give back your coin");
        gumBallMachine.setState(gumBallMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("your coin never come back");
        int winner = randomWinner.nextInt(10);
        if (winner==0 && gumBallMachine.getCount() > 1){
            gumBallMachine.setState(gumBallMachine.getWinnerState());
        }else {
            gumBallMachine.setState(gumBallMachine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("meaningless operation");
    }
}
