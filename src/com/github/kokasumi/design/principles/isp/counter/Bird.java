package com.github.kokasumi.design.principles.isp.counter;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/19 23:55
 * @description
 * @since v1.0
 */
public class Bird implements IAnimal{
    @Override
    public void eat() {
        System.out.println("鸟儿吃虫子...");
    }

    @Override
    public void fly() {
        System.out.println("鸟儿飞行...");
    }

    @Override
    public void swim() {

    }
}
