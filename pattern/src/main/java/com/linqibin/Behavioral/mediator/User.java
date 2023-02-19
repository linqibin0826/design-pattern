package com.linqibin.Behavioral.mediator;

import lombok.Data;

/**
 * 具体同事类
 *
 * @author lqb
 * @date 2023/2/19
 */
@Data
public class User {

    private String name;

    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.register(this);
    }

    public void receive(String msg) {
        System.out.println(msg);
    }

    public void send(String msg) {
        chatRoom.accept(this, msg);
    }

}
