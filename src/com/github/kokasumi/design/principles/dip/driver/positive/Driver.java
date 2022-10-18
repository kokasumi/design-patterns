package com.github.kokasumi.design.principles.dip.driver.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/18 23:37
 * @description
 * @since v1.0
 */
public class Driver implements IDriver{
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
