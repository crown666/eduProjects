package com.edu.factory.abstractfactory;

/**
 * Created by Crown on 2018/7/13.
 */
public class TestApp {
    public static void main(String[] args) {
        ComputerFactory hpComputerFactory = new HpComputerFactory();
        Keybo hpKeybo = hpComputerFactory.getKeybo();
        hpKeybo.getName();
        Mouse hpMouse = hpComputerFactory.getMouse();
        hpMouse.getName();

        ComputerFactory lenovoComputerFactory = new LenovoComputerFactory();
        Keybo lenovoKeybo = lenovoComputerFactory.getKeybo();
        lenovoKeybo.getName();
        Mouse lenovoMouse = lenovoComputerFactory.getMouse();
        lenovoMouse.getName();
    }
}
