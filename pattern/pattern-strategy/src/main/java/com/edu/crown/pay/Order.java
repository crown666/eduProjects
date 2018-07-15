package com.edu.crown.pay;

import com.edu.crown.payport.Payment;

/**
 * Created by Crown on 2018/7/15.
 */
public class Order {
    private String uid;

    private String orderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay0(Payment payment){
        PayState pay = payment.pay(uid, amount);
        return pay;
    }
    public PayState pay1(PayType payType){
        PayState pay = payType.getPayment().pay(uid, amount);
        return pay;
    }
}
