package com.github.kokasumi.design.principles.isp.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/20 0:09
 * @description
 * @since v1.0
 */
public class Dog implements IEatBehavior,ISwimBehavior{
    @Override
    public void eat() {
        System.out.println("狗吃东西...");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳...");
    }
}
