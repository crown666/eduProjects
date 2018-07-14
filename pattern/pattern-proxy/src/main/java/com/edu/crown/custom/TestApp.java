package com.edu.crown.custom;

import com.edu.crown.core.CoreInterface;
import com.edu.crown.core.impl.CoreImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by Crown on 2018/7/14.
 */
public class TestApp {
    @Test
    public void test0() throws Exception {
        CoreInterface core = new CoreImpl();
        //String s = MyProxy.generateSrc(core.getClass().getInterfaces());
        CoreInterface o = (CoreInterface) MyProxy.newProxyInstance(new MyClassLoader(), core.getClass().getInterfaces(), new MyHandler(core));
        o.coreMethodOne();
    }
}
