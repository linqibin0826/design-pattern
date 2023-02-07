package com.linqibin.interface_isolation.after;

/**
 * 接口隔离之后,可以实现了.
 * @author lqb
 * @date 2023/2/7
 */
public class ItcastSafetyDoor implements FireProof, WaterProof{

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
