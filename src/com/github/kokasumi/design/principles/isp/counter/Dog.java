package com.github.kokasumi.design.principles.isp.counter;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/19 23:56
 * @description
 * @since v1.0
 */
public class Dog implements IAnimal{
    @Override
    public void eat() {
        System.out.println("狗吃东西...");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {
        System.out.println("狗会游泳...");
    }
}
