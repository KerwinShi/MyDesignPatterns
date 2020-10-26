package com.company.singleton;

import com.sun.source.tree.SynchronizedTree;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 11:56
 * @Description:
 */
public class Singleton {
//    private static Singleton singleton;

    private Singleton(){}

    //原始状态：存在问题，多线程时可能会创建多个实例，从而造成问题
//    public static Singleton getSingleton(){
//        if (singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    //多线程版1:存在问题，synchronized以前是重量级的锁，性能受到影响
//    public  static synchronized Singleton getSingleton(){
//        if (singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    //多线程版2：双重检查double check
    //存在的问题：volatile开始支持版本为java 5，之前的版本不适合
    private volatile static Singleton singleton;
    public  static synchronized Singleton getSingleton(){
        //避免每一次在其他地方使用的时候也需要的加锁操作，提高工作性能
        if (singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }


    //多线程版3:一开始就直接初始化一个实例
//    private static Singleton singleton = new Singleton();
//    public  static synchronized Singleton getSingleton(){
//        return singleton;
//    }

    public void diasplay(){
        System.out.println("this is a singleton demo");
    }
}
