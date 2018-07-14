package com.edu.crown.dynamic.jdk;

import com.edu.crown.core.CoreInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Crown on 2018/7/13.
 */
public class JdkHandler implements InvocationHandler {
    private Object oblect;

    public JdkHandler(Object oblect) {
        this.oblect = oblect;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args){

        Object invoke = null;
        try {
            System.out.println("JdkHandler 前置");
            invoke = method.invoke(oblect, args);
            System.out.println("JdkHandler 返回");
        } catch (Exception e) {
            System.out.println("JdkHandler 异常");
            e.printStackTrace();
        }
        System.out.println("JdkHandler 后置");
        return invoke;
    }
}
