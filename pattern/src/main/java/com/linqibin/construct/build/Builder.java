package com.linqibin.construct.build;


public abstract class Builder {

    Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
