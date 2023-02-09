package com.linqibin.build;

public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("皮质坐垫");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
