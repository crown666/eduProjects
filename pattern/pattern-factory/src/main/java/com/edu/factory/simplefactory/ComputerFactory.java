package com.edu.factory.simplefactory;

/**
 * Created by Crown on 2018/7/13.
 * 缺点：在新增一种类型的子类时，需要修改工厂
 *
 */
public class ComputerFactory {

    public Computer getComputer(String name){
        if(name.equalsIgnoreCase("hp")){
            return new HpComputer();
        }else if (name.equalsIgnoreCase("lenovo")){
            return new LenovoComputer();
        }else {
            return null;
        }
    }
}
