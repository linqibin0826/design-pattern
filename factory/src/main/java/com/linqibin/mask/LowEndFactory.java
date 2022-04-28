package com.linqibin.mask;

/**
 * 负责生产低端口罩的工厂
 * @author lqb
 * @date 2022/4/28
 */
public class LowEndFactory implements IMaskFactory {

    public Mask createMask() {
        return new LowEndMask();
    }
}
