package com.company.combination;

import java.util.Iterator;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/20 14:18
 * @Description:
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
