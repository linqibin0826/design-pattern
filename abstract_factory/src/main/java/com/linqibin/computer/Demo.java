package com.linqibin.computer;

import com.linqibin.computer.factory.AbstractFactory;
import com.linqibin.computer.factory.AppleFactory;
import com.linqibin.computer.product.keyboard.Keyboard;
import com.linqibin.computer.product.main.MainFrame;
import com.linqibin.computer.product.monitor.Monitor;

public class Demo {

    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        Keyboard keyboard = factory.createKeyboard();
        keyboard.show();
        MainFrame frame = factory.createMainFrame();
        frame.show();
        Monitor monitor = factory.createMonitor();
        monitor.show();
    }
}
