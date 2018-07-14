package com.edu.crown.custom;

import java.lang.reflect.Method;

/**
 * Created by Crown on 2018/7/14.
 */
public interface MyInvocationHandler {
    Object myInvoke(Object proxy, Method method, Object[] args) throws Throwable;
}
