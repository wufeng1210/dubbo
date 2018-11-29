package com.link.code.util;

/**
 * @program: dubbo
 * @description: 顺序栈
 * @author: wufeng
 * @create: 2018-11-04 12:56
 **/
public class ArrayStack {
    /** 数组 */
    private String[] items;

    /** 栈中元素个数*/
    private int count;

    /**栈的大小**/
    private int n;

    public ArrayStack(int n){
        this.items = new String[n];
        this.n= n;
        this.count = 0;
    }

    /**
     * 入栈操作
     * @param item
     * @return
     */
    public boolean push(String item){
        if(count == n){
            return false;
        }
        items[count] = item;

        ++count;
        return true;
    }

    /**
     * 出栈操作
     * @return
     */
    public String pop(){
        if(count == 0) {
            return null;
        }
        String tmp = items[count - 1];
        --count;
        return tmp;
    }
}
