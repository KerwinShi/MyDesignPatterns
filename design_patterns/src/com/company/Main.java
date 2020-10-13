package com.company;

import com.company.decorator.Beverage;
import com.company.decorator.MyBeverage;
import com.company.decorator.MyCondiment;
import com.company.strategy.Duck;
import com.company.strategy.impl.MallardDuck;
import com.company.subjectandobserver.impl.CurrentConditionsDisplay;
import com.company.subjectandobserver.impl.WeatherData;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
//策略模式
//        Duck duck = new MallardDuck();
//        duck.dislay();
//        duck.performFly();

//观察者模式
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentDisplay =
//                new CurrentConditionsDisplay(weatherData);
//        weatherData.setMeasurements(80, 65, 30.4f);

//装饰者模式
//        //初始对象
//        Beverage beverage = new MyBeverage();
//        //包装后的对象
//        beverage = new MyCondiment(beverage);
//        beverage = new MyCondiment(beverage);
//        beverage = new MyCondiment(beverage);
//        System.out.println(beverage.getDescription() + " " + beverage.cost());



    }
}
