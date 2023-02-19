package com.linqibin.Behavioral.observer;

/**
 * ConcrereObserver：具体观察者，实现抽象观察者定义的更新接口，以便在得到主题更改通知时更新自身的状态。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class BinaryObserver implements Observer {

    private final Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
