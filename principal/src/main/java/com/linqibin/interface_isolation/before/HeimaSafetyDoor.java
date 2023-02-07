package com.linqibin.interface_isolation.before;

import com.linqibin.open_close.HeimaSkinImpl;

/**
 * 安全门
 * @author lqb
 * @date 2023/2/7
 */
public class HeimaSafetyDoor implements SafetyDoor {

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
