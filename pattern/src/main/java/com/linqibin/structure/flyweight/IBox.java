package com.linqibin.structure.flyweight;

/**
 * 具体享元（Concrete Flyweight）角色
 *
 * @author lqb
 * @date 2023/2/18
 */
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I";
    }
}

class LBox extends AbstractBox {

    @Override
    public String getShape() {
        return "L";
    }
}

class OBox extends AbstractBox {

    @Override
    public String getShape() {
        return "O";
    }
}
