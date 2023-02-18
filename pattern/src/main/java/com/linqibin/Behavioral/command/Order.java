package com.linqibin.Behavioral.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 *
 * @author lqb
 * @date 2023/2/18
 */
public class Order {

    /**
     * 餐桌号
     */
    private int diningTable;

    private Map<String, Integer> content = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getContent() {
        return content;
    }

    public void setContent(String name, Integer num) {
        content.put(name, num);
    }
}
