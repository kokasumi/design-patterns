package com.github.kokasumi.design.principles.dip.driver.counter;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/18 22:59
 * @description
 * @since v1.0
 */
public class Client {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Benz benz = new Benz();
        driver.drive(benz);
    }
}
