package com.edu.crown.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Crown on 2018/7/14.
 */
public class ProtoType implements Cloneable{
    public String name;

    public List<Integer> list ;

    public Target target;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
