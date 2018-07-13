package com.edu.factory.abstractfactory;

/**
 * Created by Crown on 2018/7/13.
 */
public class HpComputerFactory implements ComputerFactory{
    @Override
    public Mouse getMouse() {
        return new HpMouse();
    }

    @Override
    public Keybo getKeybo() {
        return new HpKeybo();
    }
}
