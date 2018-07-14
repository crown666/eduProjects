package com.edu.crown.dynamic.jdk;

import com.edu.crown.core.CoreInterface;
import com.edu.crown.core.impl.CoreImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Crown on 2018/7/13.
 */
public class JdkProxy {
    private Object object;

    private InvocationHandler invocationHandler;

    public JdkProxy(Object object, InvocationHandler invocationHandler) {
        this.object = object;
        this.invocationHandler = invocationHandler;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                invocationHandler);

    }
}


