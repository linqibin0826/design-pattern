package com.linqibin.demo1;

/**
 * 产品、抽象Builder、具体Builder、Director(可以没有， 如果没有，对象的组装在Builder中完成，不符合单一职责原则)
 * @author lqb
 * @date 2022/5/11
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director(new OfoBuilder());
        Bike bike = director.construct();
        System.out.println(bike);
    }
}
