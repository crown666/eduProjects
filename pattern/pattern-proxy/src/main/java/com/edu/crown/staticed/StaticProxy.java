package com.edu.crown.staticed;

import com.edu.crown.core.CoreInterface;

/**
 * Created by Crown on 2018/7/13.
 */
public class StaticProxy implements CoreInterface{
    private CoreInterface coreInterface;

    public StaticProxy(CoreInterface coreInterface) {
        this.coreInterface = coreInterface;
    }

    @Override
    public void coreMethodOne() {
        System.out.println("前置功能");
        coreInterface.coreMethodOne();
        System.out.println("后置功能");
    }

    @Override
    public void coreMethodTwo() {
        System.out.println("前置功能");
        coreInterface.coreMethodTwo();
        System.out.println("后置功能");
    }
}
