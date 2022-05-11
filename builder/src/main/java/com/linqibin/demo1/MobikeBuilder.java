package com.linqibin.demo1;

public class MobikeBuilder extends Builder {

    @Override
    public void createFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void createSeat() {
        bike.setSeat("真皮坐垫");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
