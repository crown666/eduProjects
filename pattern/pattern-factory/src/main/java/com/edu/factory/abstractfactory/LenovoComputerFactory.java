package com.edu.factory.abstractfactory;

/**
 * Created by Crown on 2018/7/13.
 */
public class LenovoComputerFactory implements ComputerFactory{
    @Override
    public Mouse getMouse() {
        return new LenovoMouse();
    }

    @Override
    public Keybo getKeybo() {
        return new LenovoKeybo();
    }
}
