package com.company.iterators;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 20:15
 * @Description:
 */
public class LunchMenu implements Menu{
    ArrayList menus;
    @Override
    public Iterator creatIterator() {
        return menus.iterator();
    }

    public LunchMenu(){
        menus = new ArrayList();
        addItem("launch 1");
        addItem("launch 2");
        addItem("launch 3");
    }

    public void addItem(String decs){
        MenuItem menuItem = new MenuItem(decs);
        menus.add(menuItem);
    }

    public ArrayList getMenuItems(){
        return menus;
    }
}
