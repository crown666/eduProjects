package com.edu.crown.custom;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Crown on 2018/7/14.
 */
public class MyClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classPath = MyClassLoader.class.getResource("").getPath();
        File classPathFile = new File(classPath,"$Proxy0.class");
        String className = "E:\\HelloWorld.class";

        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            fileInputStream = new FileInputStream(classPathFile);
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            int len;
            while((len = fileInputStream.read(buff)) != -1){
                byteArrayOutputStream.write(buff,0,len);
            }
            return defineClass(name,byteArrayOutputStream.toByteArray(),0,byteArrayOutputStream.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
