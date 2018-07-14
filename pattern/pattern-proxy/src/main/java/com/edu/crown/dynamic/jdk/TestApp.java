package com.edu.crown.dynamic.jdk;

import com.edu.crown.core.CoreInterface;
import com.edu.crown.core.impl.CoreImpl;
import com.edu.crown.core.CoreInterface1;
import org.junit.Test;

/**
 * Created by Crown on 2018/7/13.
 */
public class TestApp {
    @Test
    public void test0(){
        //核心功能
        CoreInterface core = new CoreImpl();
        //额外功能
        JdkHandler jdkHandler = new JdkHandler(core);
        //组装切面
        JdkProxy jdkProxy = new JdkProxy(core,jdkHandler);
        CoreInterface coreImpl = (CoreInterface) jdkProxy.getInstance();
        coreImpl.coreMethodOne();
    }
}
