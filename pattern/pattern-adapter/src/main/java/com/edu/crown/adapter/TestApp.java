package com.edu.crown.adapter;

import org.junit.Test;

/**
 * Created by Crown on 2018/7/15.
 */
public class TestApp {
    @Test
    public void test0(){
        Adaptee adaptee = new Adaptee();
        adaptee.add(1,2);
    }
    @Test
    public void test1(){
        Adapter adapter = new Adapter();
        adapter.add(1,2);
        adapter.minus(2,1);
    }
}
