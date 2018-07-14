package com.edu.crown.deep;

import org.junit.Test;

/**
 * Created by Crown on 2018/7/14.
 */
public class TestApp {
    @Test
    public void test0() throws CloneNotSupportedException {
        Goku goku = new Goku();
        goku.setCudgel(new Cudgel());

        Goku clone = (Goku) goku.clone();

        System.out.println(goku == clone);
        System.out.println(goku.getCudgel() == clone.getCudgel());
    }

    @Test
    public void test1() throws Exception {
        Goku goku = new Goku();
        goku.setCudgel(new Cudgel());

        Goku clone = (Goku) goku.deepClone();

        System.out.println(goku == clone);
        System.out.println(goku.getCudgel() == clone.getCudgel());
    }
}
