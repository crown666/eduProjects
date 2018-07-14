package com.edu.crown.custom;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Crown on 2018/7/14.
 */
public class MyProxy {
    public static final String ln = "\r\n";
    public static Object newProxyInstance(MyClassLoader classLoader,Class<?>[] interfaces, MyInvocationHandler h) throws Exception {
        //生成文件java
        String s = generateSrc(interfaces);
        String filePath = MyProxy.class.getResource("").getPath();
        System.out.println(filePath);
        File f = new File(filePath + "$Proxy0.java");
        FileWriter fw = new FileWriter(f);
        fw.write(s);
        fw.flush();
        fw.close();
        //编译成.class
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = manage.getJavaFileObjects(f);
        JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
        task.call();
        manage.close();
        //加载class
        Class<?> clazz = classLoader.findClass("com.edu.crown.custom.$Proxy0");
        Constructor c = clazz.getConstructor(MyInvocationHandler.class);
        //返回对象
        Object o = c.newInstance(h);


        return o;
    }

    public static String generateSrc(Class<?>[] interfaces){
        String className = "$Proxy";
        StringBuffer sb = new StringBuffer();
        sb.append("package "+"com.edu.crown.custom;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("import com.edu.crown.custom.MyInvocationHandler;"+ln);
        sb.append("public class $Proxy0 ");
        for (int i = 0;i<interfaces.length;i++){
            if(i==0){
                sb.append("implements "+interfaces[i].getName());
            }else {
                sb.append(","+interfaces[i].getName());
            }
        }
        sb.append(" {"+ln);
        sb.append("MyInvocationHandler h;" + ln);
        sb.append("public $Proxy0() { " + ln);
        sb.append("}" + ln);
        sb.append("public $Proxy0(MyInvocationHandler h) { " + ln);
        sb.append("this.h = h;" +ln);
        sb.append("}" + ln);
        //方法
        for (Class c:interfaces) {
            for (Method m:c.getMethods()) {
                sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(" );
                Class<?>[] parameterTypes = m.getParameterTypes();
                for (int i = 0;i<parameterTypes.length;i++){
                    String typeName = parameterTypes[i].getTypeName();
                    if(i==0){
                        sb.append(parameterTypes[i].getName());
                    }else {
                        sb.append(","+parameterTypes[i].getName());
                    }
                }
                sb.append(") {" + ln);
                sb.append("try{" + ln);
                sb.append("Method m = " + c.getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
                sb.append("this.h.myInvoke(this,m,null);" + ln);
                sb.append("}catch(Throwable e){" + ln);
                sb.append("e.printStackTrace();" + ln);
                sb.append("}");
                sb.append("}"+ln);
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
