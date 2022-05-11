package com.linqibin.computer.factory;

import com.linqibin.computer.product.keyboard.DellKeyboard;
import com.linqibin.computer.product.keyboard.Keyboard;
import com.linqibin.computer.product.main.DellMainFrame;
import com.linqibin.computer.product.main.MainFrame;
import com.linqibin.computer.product.monitor.DellMonitor;
import com.linqibin.computer.product.monitor.Monitor;

/**
 * Dell工厂  一个产品族一个工厂
 * @author lqb
 * @date 2022/4/29
 */
public class DellFactory implements AbstractFactory {
    @Override
    public Monitor createMonitor() {
        return new DellMonitor();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public MainFrame createMainFrame() {
        return new DellMainFrame();
    }
}
