package com.linqibin.pay;

import com.linqibin.pay.enums.PayEnum;
import com.linqibin.pay.strategy.AliPayment;
import com.linqibin.pay.strategy.Payment;
import com.linqibin.pay.strategy.WeChatPayment;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付工厂
 * @author lqb
 * @date 2022/4/28
 */
public class PayFactory {

    private static final Map<PayEnum, Payment> MAP = new HashMap<PayEnum, Payment>();

    static {
        MAP.put(PayEnum.A_Li, new AliPayment());
        MAP.put(PayEnum.We_Chat, new WeChatPayment());
    }

    public static Payment getPayment(Integer payType) {
        return MAP.get(PayEnum.getPayEnum(payType));
    }
}
