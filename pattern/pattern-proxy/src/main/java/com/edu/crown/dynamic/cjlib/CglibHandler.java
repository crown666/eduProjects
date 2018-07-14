package com.edu.crown.dynamic.cjlib;


import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * Created by Crown on 2018/7/13.
 */
public class CglibHandler implements InvocationHandler {
    private Object object;

    public CglibHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object invoke = null;
        try {
            System.out.println("cglibHandler 前置");
            invoke = method.invoke(object, objects);
            System.out.println("cglibHandler 返回");
        } catch (Exception e) {
            System.out.println("cglibHandler 异常");
            e.printStackTrace();
        }
        System.out.println("cglibHandler 后置");
        return invoke;
    }
}
