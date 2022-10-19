package com.github.kokasumi.design.principles.isp.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/20 0:08
 * @description
 * @since v1.0
 */
public class Bird implements IEatBehavior,IFlyBehavior{
    @Override
    public void eat() {
        System.out.println("鸟吃虫...");
    }

    @Override
    public void fly() {
        System.out.println("鸟飞行...");
    }
}
