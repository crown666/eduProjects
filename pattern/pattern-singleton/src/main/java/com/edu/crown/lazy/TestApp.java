package com.edu.crown.lazy;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Crown on 2018/7/14.
 */
public class TestApp {
    @Test
    public void test0(){
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for(int i = 0; i<100; i++){
            Thread thread = new Thread() {
                @Override
                public void run() {
                    /*try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    LazySingleton.getLazySingleton();
                    countDownLatch.countDown();
                }
            };
            thread.start();

        }
        try {
            countDownLatch.await();
            System.out.println("===========");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
