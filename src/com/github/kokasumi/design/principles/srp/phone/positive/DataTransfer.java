package com.github.kokasumi.design.principles.srp.phone.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 16:31
 * @description
 * @since v1.0
 */
public class DataTransfer implements IDataTransfer{
    @Override
    public void chat(IConnectionManager cm) {
        System.out.println("通话中...");
    }
}
