package com.linqibin.Behavioral.mediator;

/**
 * * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 * 具体中介者（ConcreteMediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 * 抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 *
 * @author lqb
 * @date 2023/2/19
 */
public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user = new User("林琪斌", chatRoom);
        User user1 = new User("游美", chatRoom);

        user.send("你好啊，游美");


    }
}
