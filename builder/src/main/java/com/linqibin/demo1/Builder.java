package com.linqibin.demo1;

/**
 * 抽象的建造者，负责定义接口，不负责具体实现
 * @author lqb
 * @date 2022/5/11
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    /**
     * 构建车架
     * @return
     */
    public abstract void createFrame();

    /**
     * 构建车座
     * @return
     */
    public abstract void createSeat();

    public abstract Bike createBike();
}
