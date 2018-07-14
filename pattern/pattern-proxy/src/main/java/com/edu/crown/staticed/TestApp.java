package com.edu.crown.staticed;

import com.edu.crown.core.impl.CoreImpl;
import org.junit.Test;

/**
 * Created by Crown on 2018/7/13.
 */
public class TestApp {
    @Test
    public void test0(){
        StaticProxy staticProxy = new StaticProxy(new CoreImpl());
        staticProxy.coreMethodOne();
        staticProxy.coreMethodTwo();
    }
}
