package com.company.combination;

import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 20:39
 * @Description:
 */
public class Waitress {
    MenuComponent allMemus;

    public Waitress(MenuComponent allMemus) {
        this.allMemus = allMemus;
    }

    public void printMenu(){
        allMemus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMemus.createIterator();
        System.out.println("\nVEGETRAIAN MENU\n-----");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }
}
