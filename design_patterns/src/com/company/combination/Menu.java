package com.company.combination;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/20 10:48
 * @Description:
 */
public class Menu extends MenuComponent{
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return (MenuComponent) menuComponents.get(i);
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.println("........."+getName());
        System.out.println("........."+getDescription());
        System.out.println("-------------------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator(){
        return new CombinationIterator(menuComponents.iterator());
    }
}
