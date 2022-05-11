package com.linqibin.computer.factory;

import com.linqibin.computer.product.keyboard.Keyboard;
import com.linqibin.computer.product.main.MainFrame;
import com.linqibin.computer.product.monitor.Monitor;

/**
 * 抽象工厂
 * @author lqb
 * @date 2022/4/29
 */
public interface AbstractFactory {

    Monitor createMonitor();

    Keyboard createKeyboard();

    MainFrame createMainFrame();
}
