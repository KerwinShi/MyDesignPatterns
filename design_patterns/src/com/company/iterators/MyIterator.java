package com.company.iterators;

import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 20:09
 * @Description:
 */
public class MyIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;
    public MyIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>=menuItems.length || menuItems[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
