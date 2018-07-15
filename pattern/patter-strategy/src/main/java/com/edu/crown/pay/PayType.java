package com.edu.crown.pay;

import com.edu.crown.payport.Payment;
import com.edu.crown.payport.impl.AliPay;
import com.edu.crown.payport.impl.WechatPay;

/**
 * Created by Crown on 2018/7/15.
 */
public enum PayType {
    ALIPAY(new AliPay()),
    WECHATPAY(new WechatPay());

    private Payment payment;

    PayType(Payment payment){
        this.payment = payment;
    }

    public Payment getPayment(){
        return this.payment;
    }
}
