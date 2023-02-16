package com.linqibin.structure.decorator;

public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FriedNoodle();
        System.out.println(fastFood.getDesc() + ":" + fastFood.cost());

        System.out.println("============");
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + ":" + fastFood.cost());

        System.out.println("============");
        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + ":" + fastFood.cost());
    }
}
