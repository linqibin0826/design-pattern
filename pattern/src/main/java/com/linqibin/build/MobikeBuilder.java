package com.linqibin.build;

public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铁质车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("沙发坐垫");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
