package com.github.kokasumi.design.principles.dip.driver.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/18 23:37
 * @description
 * @since v1.0
 */
public class Benz implements ICar{
    @Override
    public void run() {
        System.out.println("奔驰汽车开始运行...");
    }
}
