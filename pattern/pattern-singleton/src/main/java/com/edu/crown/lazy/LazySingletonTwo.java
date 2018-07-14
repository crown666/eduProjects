package com.edu.crown.lazy;

/**
 * Created by Crown on 2018/7/14.
 */
public class LazySingletonTwo {
    private LazySingletonTwo(){}

    private static LazySingletonTwo lazySingletonTwo = null;

    public static synchronized LazySingletonTwo getLazySingletonTwo(){
        if(lazySingletonTwo == null){
            lazySingletonTwo = new LazySingletonTwo();
        }
        System.out.println(lazySingletonTwo);
        return lazySingletonTwo;
    }
}
