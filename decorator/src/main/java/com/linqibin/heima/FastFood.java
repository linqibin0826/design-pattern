package com.linqibin.heima;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.security.PrivateKey;

/**
 * 抽象构件
 * @author lqb
 * @date 2022/5/16
 */
public abstract class FastFood {

    private float price;

    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    /**
     * 总金额
     * @return
     */
    public abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
