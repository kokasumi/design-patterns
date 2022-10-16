package com.github.kokasumi.design.principles.srp.phone.composition;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 16:31
 * @description
 * @since v1.0
 */
public interface IDataTransfer {
    /**
     * 通话
     * @param cm
     */
    void chat(IConnectionManager cm);
}
