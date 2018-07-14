package com.edu.crown.hungry;

/**
 * Created by Crown on 2018/7/14.
 */
public class HungrySingleton {
    private HungrySingleton(){

    }

    public static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getHungrySingleton(){
        System.out.println(hungrySingleton);
        return  hungrySingleton;
    }
}
