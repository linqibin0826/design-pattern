package com.linqibin.heima;

/**
 *
 * @author lqb
 * @date 2022/5/16
 */
public class Demo {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("===========================");
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("===========================");
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
    }
}
