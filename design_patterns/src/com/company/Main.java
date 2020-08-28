package com.company;

import com.company.strategy.Duck;
import com.company.strategy.impl.MallardDuck;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck duck = new MallardDuck();
        duck.dislay();
        duck.performFly();
    }
}
