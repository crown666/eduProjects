package com.edu.crown.lazy;

/**
 * Created by Crown on 2018/7/14.
 */
public class LazySingletonThree {

    private static boolean initialized = false;

    private LazySingletonThree(){
        //防止反射侵犯
        if(initialized == false){
            initialized = !initialized;
        }else {
            throw new RuntimeException("反射被侵犯");
        }
    }
    public static final LazySingletonThree getLazySingletonThree(){
        return LazySingletonThreeHolder.lazySingletonThree;
    }
    //默认使用LazySingletonThree时会先初始化内部类
    //如果没有使用的话，内部类是不加载的
    private static class LazySingletonThreeHolder{
        private static final LazySingletonThree lazySingletonThree = new LazySingletonThree();
    }
}
