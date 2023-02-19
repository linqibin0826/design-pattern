package com.linqibin.Behavioral.observer;

/**
 * ConcreteSubject：具体主题（具体被观察者），该角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class SubjectImpl extends Subject {


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObs() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
