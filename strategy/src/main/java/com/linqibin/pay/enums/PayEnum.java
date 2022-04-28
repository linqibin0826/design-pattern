package com.linqibin.pay.enums;

/**
 * 支付类型枚举
 * @author lqb
 * @date 2022/4/28
 */
public enum PayEnum {
    /**
     * 支付宝
     */
    A_Li(1, "支付宝支付"),
    We_Chat(2, "微信支付");

    private Integer payType;
    private String desc;

    PayEnum(Integer payType, String desc) {
        this.payType = payType;
        this.desc = desc;
    }

    public static PayEnum getPayEnum(Integer payType) {
        for (PayEnum value : PayEnum.values()) {
            if (value.payType.equals(payType)) {
                return value;
            }
        }
        return null;
    }
}
