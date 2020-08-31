package com.company.subjectandobserver.impl;

import com.company.subjectandobserver.Displayer;
import com.company.subjectandobserver.Observer;
import com.company.subjectandobserver.Subject;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/8/31 21:05
 * @Description:
 */
public class CurrentConditionsDisplay implements Observer, Displayer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    //订阅，注册
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    //提供的更新函数
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
