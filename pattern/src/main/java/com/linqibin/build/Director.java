package com.linqibin.build;

/**
 * 指挥者类
 * @author lqb
 * @date 2023/2/9
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }

    public static void main(String[] args) {
        System.out.println(new Director(new OfoBuilder()).construct());
    }
}
