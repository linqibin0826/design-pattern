package com.linqibin.pay.strategy;

/**
 *
 * @author lqb
 * @date 2022/4/28
 */
public class AliPayment implements Payment {

    public String pay() {
        return "支付宝支付成功";
    }
}
