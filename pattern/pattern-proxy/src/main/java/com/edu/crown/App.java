package com.edu.crown;

import com.edu.crown.core.impl.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Object helloWorld = new HelloWorld();
        System.out.println(helloWorld.toString());
    }
}
