package com.edu.factory.staticfactory;

/**
 * Created by Crown on 2018/7/13.
 */
public class HpComputer implements Computer {

    @Override
    public void getName() {
        System.out.println("static HP Computer");
    }
}
