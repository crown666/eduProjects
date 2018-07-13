package com.edu.factory.staticfactory;

/**
 * Created by Crown on 2018/7/13.
 * 缺点：在新增一种类型的子类时，需要修改工厂
 *
 */
public interface ComputerFactory {

    Computer getComputer();
}
