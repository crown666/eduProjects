package com.edu.crown.simple;

import com.edu.crown.simple.ProtoType;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Crown on 2018/7/14.
 */
public class TestApp {
    @Test
    public void test0() throws Exception {
        ProtoType protoType = new ProtoType();
        protoType.target = new Target();

        ProtoType clone = (ProtoType) protoType.clone();
        System.out.println(protoType.target);
        System.out.println(clone.target);

    }
}
