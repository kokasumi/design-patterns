package com.github.kokasumi.design.principles.srp.phone.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 16:28
 * @description 协议管理接口
 * @since v1.0
 */
public interface IConnectionManager {
    /**
     * 拨通电话
     * @param phoneNumber
     */
    void dial(String phoneNumber);

    /**
     * 通话完毕，挂电话
     */
    void hangup();
}
