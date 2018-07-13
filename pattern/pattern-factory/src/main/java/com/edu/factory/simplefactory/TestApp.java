package com.edu.factory.simplefactory;

import org.junit.Test;

/**
 * Created by Crown on 2018/7/13.
 */
public class TestApp {
    @Test
    public void test0(){
        //创建工厂
        ComputerFactory computerFactory = new ComputerFactory();
        Computer hp = computerFactory.getComputer("hp");
        hp.getName();
        Computer lenovo = computerFactory.getComputer("lenovo");
        lenovo.getName();
    }
}
