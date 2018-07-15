package com.edu.crown;

import com.edu.crown.pay.Order;
import com.edu.crown.pay.PayState;
import com.edu.crown.pay.PayType;
import com.edu.crown.payport.impl.AliPay;
import com.edu.crown.payport.impl.WechatPay;
import org.junit.Test;

/**
 * Created by Crown on 2018/7/15.
 */
public class TestApp {
    @Test
    public void test0(){
        Order order = new Order("2", "5353534456363", 1.1);

        PayState pay = order.pay0(new WechatPay());
        System.out.println(pay);
    }
    @Test
    public void test1(){
        Order order = new Order("2", "5353534456363", 1.1);

        PayState pay = order.pay1(PayType.WECHATPAY);
        System.out.println(pay);
    }
}
