package com.edu.factory.staticfactory;

/**
 * Created by Crown on 2018/7/13.
 */
public class LenovoComputer implements Computer {
    @Override
    public void getName() {
        System.out.println("static Lenovo Computer");
    }
}
