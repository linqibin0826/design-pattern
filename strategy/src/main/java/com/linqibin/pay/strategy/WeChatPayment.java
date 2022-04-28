package com.linqibin.pay.strategy;

/**
 *
 * @author lqb
 * @date 2022/4/28
 */
public class WeChatPayment implements Payment {

    public String pay() {
        return "微信支付成功";
    }
}
