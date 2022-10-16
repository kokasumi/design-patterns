package com.github.kokasumi.design.principles.srp.phone.composition;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 16:18
 * @description
 * @since v1.0
 */
public class Phone implements IConnectionManager,IDataTransfer {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("拨通" + phoneNumber + "电话...");
    }

    @Override
    public void hangup() {
        System.out.println("挂断电话");
    }

    @Override
    public void chat(IConnectionManager cm) {
        System.out.println("通话中...");
    }
}
