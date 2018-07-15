package com.edu.crown;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/**
 * Created by Crown on 2018/7/15.
 */
public class TestApp {
    @Test
    public void test0(){
        InputStream is = null;
        DataInputStream dataInputStream = new DataInputStream(is);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(dataInputStream);
    }

}
