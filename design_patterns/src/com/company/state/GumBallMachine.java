package com.company.state;

import com.company.state.concretesatets.*;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/26 19:41
 * @Description:
 */
public class GumBallMachine {
    State hasCoinState;
    State noCoinState;
    State soldState;
    State soldOutState;
    State winnerState;

    State state = soldState;
    int count = 0 ;

    public GumBallMachine(int count) {
        hasCoinState = new HasCoinState(this);
        noCoinState = new NoCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if(count>0){
            state = noCoinState;
        }
    }

    public  void insertCoin(){state.insertCoin();};
    public  void ejectCoin(){state.ejectCoin();};
    public  void turnCrank(){
        state.turnCrank();
        state.dispense();
    };

    public void setState(State state){
        this.state = state;
    }

    public void  realseBall(){
        System.out.println("give a gumball......");
        if(count !=0){
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
