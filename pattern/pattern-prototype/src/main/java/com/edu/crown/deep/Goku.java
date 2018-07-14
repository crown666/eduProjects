package com.edu.crown.deep;

import java.io.*;

/**
 * Created by Crown on 2018/7/14.
 */
public class Goku extends Monkey implements Cloneable{
    private Cudgel cudgel;

    public Cudgel getCudgel() {
        return cudgel;
    }

    public void setCudgel(Cudgel cudgel) {
        this.cudgel = cudgel;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object obj = ois.readObject();
        return obj;
    }
}
