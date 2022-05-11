package com.linqibin.computer.factory;

import com.linqibin.computer.product.keyboard.Keyboard;
import com.linqibin.computer.product.keyboard.LenovoKeyboard;
import com.linqibin.computer.product.main.LenovoMainFrame;
import com.linqibin.computer.product.main.MainFrame;
import com.linqibin.computer.product.monitor.LenovoMonitor;
import com.linqibin.computer.product.monitor.Monitor;

public class LenovoFactory implements AbstractFactory {
    @Override
    public Monitor createMonitor() {
        return new LenovoMonitor();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LenovoKeyboard();
    }

    @Override
    public MainFrame createMainFrame() {
        return new LenovoMainFrame();
    }
}
