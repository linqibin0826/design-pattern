package com.linqibin.demo1;

public class OfoBuilder extends Builder {
    @Override
    public void createFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void createSeat() {
        bike.setSeat("海绵坐垫");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
