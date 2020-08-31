package com.company;

import com.company.strategy.Duck;
import com.company.strategy.impl.MallardDuck;
import com.company.subjectandobserver.impl.CurrentConditionsDisplay;
import com.company.subjectandobserver.impl.WeatherData;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Duck duck = new MallardDuck();
//        duck.dislay();
//        duck.performFly();


        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
