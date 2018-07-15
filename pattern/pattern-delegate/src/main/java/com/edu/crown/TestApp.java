package com.edu.crown;

import com.edu.crown.dispatcher.ServletDIspatcher;
import org.junit.Test;

/**
 * Created by Crown on 2018/7/15.
 */
public class TestApp {
    @Test
    public void test0(){
        ServletDIspatcher servletDIspatcher = new ServletDIspatcher();
        servletDIspatcher.doService("/member","");
        servletDIspatcher.doService("/system","");
    }
}
