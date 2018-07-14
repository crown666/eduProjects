package com.edu.crown.core.impl;

import com.edu.crown.core.CoreInterface;
import com.edu.crown.core.CoreInterface1;

/**
 * Created by Crown on 2018/7/13.
 */
public class CoreImpl implements CoreInterface,CoreInterface1 {
    @Override
    public void coreMethodOne() {
        System.out.println("coreMethodOne");
    }

    @Override
    public void coreMethodTwo() {
        System.out.println("coreMethodTwo");
    }

    @Override
    public void coreMethod1() {
        System.out.println("coreMethod1");
    }

    @Override
    public void coreMethod2() {
        System.out.println("coreMethod2");
    }
}
