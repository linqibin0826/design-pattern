package com.linqibin.law_of_demeter;

import com.linqibin.interface_isolation.after.Demo;
import lombok.Data;

/**
 * 经纪人类,  用来实现迪米特法则
 * @author lqb
 * @date 2023/2/7
 */
@Data
public class Agent {

    private Star star;

    private Company company;

    private Fans fans;

    public void meeting() {
        System.out.println(fans.getName() + "与" + star.getName() + "见面了");
    }

    public void business() {
        System.out.println(star.getName() + "与" + company.getName() + "达成商务合作");
    }

    public static void main(String[] args) {
        Agent agent = new Agent();
        Star star1 = new Star("刘亦菲");
        Company company1 = new Company("乐石");
        Fans fans1 = new Fans("林琪斌");
        agent.setStar(star1);
        agent.setFans(fans1);
        agent.setCompany(company1);
        agent.meeting();
        agent.business();
    }
}
