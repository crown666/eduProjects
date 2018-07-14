package com.edu.crown.custom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Crown on 2018/7/14.
 */
public class MyHandler implements MyInvocationHandler{
    private Object object;

    public MyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object myInvoke(Object proxy, Method method, Object[] args){
        Object invoke = null;
        try {
            System.out.println("MyHandler 前置");
            invoke = method.invoke(object, args);
            System.out.println("MyHandler 返回");
        } catch (Exception e) {
            System.out.println("MyHandler 异常");
            e.printStackTrace();
        }
        System.out.println("MyHandler 后置");
        return invoke;
    }
}
