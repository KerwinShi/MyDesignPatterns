package com.company.iterators;

import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 20:12
 * @Description:
 */
public class BreakFastMenu implements Menu{
    private MenuItem[] menuItems;
    private static final Integer MAXLENGTH = 6;
    private int countNum = 0;

    public BreakFastMenu() {
        menuItems = new MenuItem[MAXLENGTH];
        addItem("breakfast 1");
        addItem("breakfast 2");
        addItem("breakfast 3");
    }

    public void addItem(String decs){
        MenuItem menuItem = new MenuItem(decs);
        if(countNum>=MAXLENGTH){
            System.err.println("add item failure");
        } else {
            menuItems[countNum] = menuItem;
            countNum++;
        }
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }

    @Override
    public Iterator creatIterator(){
        return new MyIterator(menuItems);
    }
}
