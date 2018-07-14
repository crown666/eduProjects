package com.edu.crown.lazy;

/**
 * Created by Crown on 2018/7/14.
 */
public class LazySingletonOne {
    private LazySingletonOne(){}

    private static LazySingletonOne LazySingletonOne = null;

    public static LazySingletonOne getLazySingleton(){
        if(LazySingletonOne == null){
            LazySingletonOne = new LazySingletonOne();
        }
        System.out.println(LazySingletonOne);
        return LazySingletonOne;
    }
}
