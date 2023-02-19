package com.linqibin.Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject：抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，每个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象。
 *
 * @author lqb
 * @date 2023/2/19
 */
public abstract class Subject {

    protected int state;

    protected final List<Observer> observers = new ArrayList<>();

    public abstract void attach(Observer observer);

    public abstract void notifyObs();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
