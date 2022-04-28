package com.linqibin.pay;

/**
 *
 * @author lqb
 * @date 2022/4/28
 */
public class Demo {

    public static void main(String[] args) {

        // 支付方式 从前端传进来
        Integer payType = 2 ;
        String pay = PayFactory.getPayment(payType).pay();
        System.out.println(pay);
    }
}
