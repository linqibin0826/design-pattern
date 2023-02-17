package com.linqibin.structure.facade;

/**
 * 门面角色(提供一个同一个入口)
 *
 * @author lqb
 * @date 2023/2/17
 */
public class SmartApplicationFacade {

    private Light light = new Light();

    private TV tv = new TV();

    private AirCondition airCondition = new AirCondition();

    public void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    public void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
