package com.linqibin.computer.factory;

import com.linqibin.computer.product.keyboard.AppleKeyboard;
import com.linqibin.computer.product.keyboard.Keyboard;
import com.linqibin.computer.product.main.AppleMainFrame;
import com.linqibin.computer.product.main.MainFrame;
import com.linqibin.computer.product.monitor.AppleMonitor;
import com.linqibin.computer.product.monitor.Monitor;

public class AppleFactory implements AbstractFactory {
    @Override
    public Monitor createMonitor() {
        return new AppleMonitor();
    }

    @Override
    public Keyboard createKeyboard() {
        return new AppleKeyboard();
    }

    @Override
    public MainFrame createMainFrame() {
        return new AppleMainFrame();
    }
}
