package com.linqibin.demo1;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.createFrame();
        builder.createSeat();

        return builder.createBike();
    }
}
