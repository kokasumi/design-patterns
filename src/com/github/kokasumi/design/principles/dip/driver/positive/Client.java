package com.github.kokasumi.design.principles.dip.driver.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/18 23:49
 * @description
 * @since v1.0
 */
public class Client {
    public static void main(String[] args) {
        IDriver driver = new Driver();
        ICar car = new BMW();
        driver.drive(car);
    }
}
