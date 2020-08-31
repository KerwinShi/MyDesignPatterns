package com.company.subjectandobserver.impl;

import com.company.subjectandobserver.Observer;
import com.company.subjectandobserver.Subject;

import java.util.ArrayList;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/8/31 20:58
 * @Description:
 */
public class WeatherData implements Subject {
    //维护观察者列表
    private ArrayList observers;
    //参数
    private float temperature;
    private float humidity;
    private float pressure;

    //构造函数，初始化观察者列表
    public WeatherData() {
        observers = new ArrayList();
    }

    //观察者列表添加
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //观察者列表移除
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    //通知观察者
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    //更新气象数据
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //状态改变，调用通知
    public void measurementsChanged() {
        notifyObserver();
    }


}
