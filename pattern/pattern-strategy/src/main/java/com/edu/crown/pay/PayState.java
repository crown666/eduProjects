package com.edu.crown.pay;

/**
 * Created by Crown on 2018/7/15.
 */
public class PayState {
    private int cood;

    private Object data;

    private String msg;

    public PayState(int cood, Object data, String msg) {
        this.cood = cood;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "[支付状态]:PayState{" +
                "cood=" + cood +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
