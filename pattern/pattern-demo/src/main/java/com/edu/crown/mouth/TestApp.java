package com.edu.crown.mouth;

import org.junit.Test;

/**
 * Created by Crown on 2018/7/15.
 */
public class TestApp {
    @Test
    public void test0(){
        Lamp redLamp = new RedLamp();
        LampMouth lampMouth = new LampMouth();
        lampMouth.setLamp(redLamp);
        lampMouth.lantern();
    }
}
