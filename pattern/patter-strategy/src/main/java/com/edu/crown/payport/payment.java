package com.edu.crown.payport;

import com.edu.crown.pay.PayState;

/**
 * Created by Crown on 2018/7/15.
 * =============
 * ====
 */
public interface Payment {
    /**
     *
     * @param uid
     * @param amount
     * @return
     */
    PayState pay(String uid,double amount);
}
