package com.company.subjectandobserver;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/8/28 20:37
 * @Description:主题
 */
public interface Subject {
    //观察者管理
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    //通知观察者
    public void notifyObserver();

}
