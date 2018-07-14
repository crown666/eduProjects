package com.edu.crown.serializable;

import java.io.Serializable;

/**
 * Created by Crown on 2018/7/14.
 */
public class Serializ implements Serializable{
    public final static Serializ serializ = new Serializ();

    private Serializ(){}

    public static Serializ getSerializ(){
        return serializ;
    }

    private Object readResolve(){
        return serializ;
    }
}
