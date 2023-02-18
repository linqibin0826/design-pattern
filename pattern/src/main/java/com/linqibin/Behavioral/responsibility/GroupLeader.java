package com.linqibin.Behavioral.responsibility;

public class GroupLeader extends Handler {
    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    public void handleLeave(Leave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天.");
        System.out.println("小组长审批：同意。");
    }
}
