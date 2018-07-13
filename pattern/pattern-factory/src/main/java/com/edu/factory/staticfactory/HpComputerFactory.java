package com.edu.factory.staticfactory;

/**
 * Created by Crown on 2018/7/13.
 */
public class HpComputerFactory implements ComputerFactory{

    @Override
    public Computer getComputer() {
        return new HpComputer();
    }
}
