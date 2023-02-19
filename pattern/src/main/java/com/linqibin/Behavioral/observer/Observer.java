package com.linqibin.Behavioral.observer;

/**
 * Observer：抽象观察者，是观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己。
 *
 * @author lqb
 * @date 2023/2/19
 */
public interface Observer {

    void update();
}
