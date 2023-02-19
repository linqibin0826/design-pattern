package com.linqibin.Behavioral.mediator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 具体中介者
 *
 * @author lqb
 * @date 2023/2/19
 */
public class ChatRoom {

    private final List<User> userList = new ArrayList<>();

    public void register(User user) {
        userList.add(user);
    }

    public void accept(User user, String msg) {
        msg = new Date()
                + " [" + user.getName() + "] : " + msg;
        for (User userItem : userList) {
            if (user == userItem) {
                continue;
            }
            userItem.receive(msg);
        }
    }
}
