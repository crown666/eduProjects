package com.edu.crown.core.impl;
import java.lang.reflect.Method;
import com.edu.crown.custom.MyInvocationHandler;
public class $Proxy0 implements com.edu.crown.core.CoreInterface,com.edu.crown.core.CoreInterface1 {
    MyInvocationHandler h;
    public $Proxy0() {
    }
    public $Proxy0(MyInvocationHandler h) {
        this.h = h;
    }
    public void coreMethodTwo() {
        try{
            Method m = com.edu.crown.core.CoreInterface.class.getMethod("coreMethodTwo",new Class[]{});
            this.h.myInvoke(this,m,null);
        }catch(Throwable e){
            e.printStackTrace();
        }}
    public void coreMethodOne() {
        try{
            Method m = com.edu.crown.core.CoreInterface.class.getMethod("coreMethodOne",new Class[]{});
            this.h.myInvoke(this,m,null);
        }catch(Throwable e){
            e.printStackTrace();
        }}
    public void coreMethod1() {
        try{
            Method m = com.edu.crown.core.CoreInterface1.class.getMethod("coreMethod1",new Class[]{});
            this.h.myInvoke(this,m,null);
        }catch(Throwable e){
            e.printStackTrace();
        }}
    public void coreMethod2() {
        try{
            Method m = com.edu.crown.core.CoreInterface1.class.getMethod("coreMethod2",new Class[]{});
            this.h.myInvoke(this,m,null);
        }catch(Throwable e){
            e.printStackTrace();
        }}
}