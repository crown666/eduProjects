package com.edu.crown.register;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Crown on 2018/7/14.
 */
public class RegisterMap {
    private static Map<String,Object> register = new HashMap<String,Object>();

    public static Object getRegisterMap(String name){
        Object obj;
        if(name == null){
            obj = null;
        }
        if(register.get(name) == null){
            obj = null;
        }else {
            obj = register.get(name);
        }
        return obj;
    }

    public static void setRegister(String name){
        Object obj = null;
        try {
            Class<?> clazz = Class.forName(name);
            obj = clazz.newInstance();
        } catch (Exception e) {
            System.out.println("注册失败");
        }
        register.put(name,obj);
    }
}
