package com.edu.crown.payport.impl;

import com.edu.crown.pay.PayState;
import com.edu.crown.payport.Payment;

/**
 * Created by Crown on 2018/7/15.
 */
public class AliPay implements Payment{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户");
        return new PayState(200,amount,"支付成功");
    }
}
