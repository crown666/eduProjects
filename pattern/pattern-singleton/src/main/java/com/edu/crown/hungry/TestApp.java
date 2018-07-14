package com.edu.crown.hungry;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Crown on 2018/7/14.
 */
public class TestApp {
    @Test
    public void test0(){
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i<10; i++) {
            Thread t = new Thread(){
                @Override
                public void run() {
                    countDownLatch.countDown();
                    HungrySingleton.getHungrySingleton();
                }
            };
            t.start();

        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
