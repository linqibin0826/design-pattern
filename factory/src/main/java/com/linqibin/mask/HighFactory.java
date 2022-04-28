package com.linqibin.mask;

/**
 * 负责生产高级口罩的工厂
 * @author lqb
 * @date 2022/4/28
 */
public class HighFactory implements IMaskFactory {

    public Mask createMask() {
        return new HighEndMask();
    }
}
