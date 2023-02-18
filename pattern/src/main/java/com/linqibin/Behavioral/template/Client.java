package com.linqibin.Behavioral.template;

/**
 * 模板方法（Template Method）模式包含以下主要角色：
 * 抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 * 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
 * 基本方法：是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为三种：
 * 抽象方法(Abstract Method) ：一个抽象方法由抽象类声明、由其具体子类实现。
 * 具体方法(Concrete Method) ：一个具体方法由一个抽象类或具体类声明并实现，其子类可以进行覆盖也可以直接继承。
 * 钩子方法(Hook Method) ：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
 * 一般钩子方法是用于判断的逻辑方法，这类方法名一般为isXxx，返回值类型为boolean类型。
 * 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。
 *
 * @author lqb
 * @date 2023/2/18
 */
public class Client {

    /**
     * 流程由抽象类控制的,无法改变. 控制反转
     *
     * @author lqb
     * @date 2023/2/18
     */
    public static void main(String[] args) {
        //炒手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        System.out.println("=========");
        //炒蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
