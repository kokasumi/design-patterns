package com.github.kokasumi.design.principles.dip.driver.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/18 23:37
 * @description
 * @since v1.0
 */
public interface IDriver {
    /**
     * 司机驾驶车辆
     * @param car
     */
    void drive(ICar car);
}
