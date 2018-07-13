package com.edu.factory.staticfactory;

import org.junit.Test;

/**
 * Created by Crown on 2018/7/13.
 */
public class TestApp {
    @Test
    public void test0(){
        ComputerFactory hpComputerFactory = new HpComputerFactory();
        Computer hpComputer = hpComputerFactory.getComputer();
        hpComputer.getName();

        ComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
        Computer lenovoComputer = lenovoComputerFactory.getComputer();
        lenovoComputer.getName();

    }
}
