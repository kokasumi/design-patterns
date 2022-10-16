package com.github.kokasumi.design.principles.srp.phone.counter;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 16:17
 * @description 电话过程接口
 * @since v1.0
 */
public interface IPhone {
    /**
     * 拨通电话
     * @param phoneNumber
     */
    void dial(String phoneNumber);

    /**
     * 通话
     * @param o
     */
    void chat(Object o);

    /**
     * 通话完毕，挂电话
     */
    void hangup();
}
