package com.company.combination;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/20 14:19
 * @Description:
 */
public class CombinationIterator implements Iterator {
    Stack stack = new Stack();


    public CombinationIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public Object next(){
        if (hasNext()){//当客户取下一个的时候，先调用hasNext来确定是否还有下一个
            Iterator iterator = (Iterator) stack.peek();
            //如果有下一个元素，我们就从堆栈中去除目前的迭代器，然后取得它的下一个元素
            MenuComponent component = (MenuComponent) iterator.next();
            //如果元素是一个菜单，我们有了另一个需要被包含进遍历中的组合，所以我们将它丢进堆栈中。不管是不是菜单，我们都返回组件。
            if (component instanceof  Menu){
                stack.push(component.createIterator());
                System.out.println("-----------------------push-------------------------");
            }
            return component;
        }else {
            return null;
        }
    }

    public boolean hasNext(){
        //想要知道是否有下一个元素，我们检查栈堆是否被清空，如果已经空了，就表示没有下一个元素了。
        if(stack.empty()){
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            //我们就从堆栈的顶层中取出迭代器，看看是否还有下一个元素。如果它没有元素，我们将它弹出堆栈，然后递归地调用hasNext()
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {//表示还有下一个元素
                return true;
            }
        }
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
