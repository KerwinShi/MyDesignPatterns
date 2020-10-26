package com.company.iterators;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 20:39
 * @Description:
 */
public class Waitress {
    private ArrayList<Menu> menus;

    public Waitress( ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.creatIterator());
        }
    }
    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getDesc());
        }
    }
}
