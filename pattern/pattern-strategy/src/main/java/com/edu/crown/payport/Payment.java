package com.edu.crown.payport;

import com.edu.crown.pay.PayState;

/**
 * Created by Crown on 2018/7/15.
 */
public interface Payment {
    PayState pay(String uid, double amount);
}
