package com.linqibin.interface_isolation.after;

import com.linqibin.interface_isolation.before.SafetyDoor;

/**
 * 实现最小接口即可
 * @author lqb
 * @date 2023/2/7
 */
public class HeimaSafetyDoor implements AntiTheft, FireProof, WaterProof {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
