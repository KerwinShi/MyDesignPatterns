package com.company.template;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 16:55
 * @Description:
 */
public abstract class Template {
    //模板方法：定义了算法的框架，具体的可以由子类对方法进行改变
    public void callMethods(){
        method1();
        method2();
        method3();
        if(hook()){
            System.out.println("hook worked");
        }
    }

    public abstract void method1();

    public abstract void method2();

    public final void method3() {
        System.out.println("method 3 worked");
    }

    //可以什么事情都不敢
    public boolean hook(){
        return true;
    }
}
