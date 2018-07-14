package com.edu.crown.dynamic.cjlib;


import com.edu.crown.core.impl.CoreImpl;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * Created by Crown on 2018/7/13.
 */
public class TestApp {
    @Test
    public void test0(){
        CoreImpl core = new CoreImpl();
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(core.getClass());
        CglibHandler cglibHandler = new CglibHandler(core);
        enhancer.setCallback(cglibHandler);

        CoreImpl o = (CoreImpl) enhancer.create();
        o.coreMethod1();
    }
}
