package com.github.kokasumi.design.principles.srp.user.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 18:27
 * @description
 * @since v1.0
 */
public interface IUserManager {
    /**
     * 修改用户名
     * @param newUserName
     */
    void changeUserName(String newUserName);

    /**
     * 修改住址
     * @param newHomeAddress
     */
    void changeHomeAddress(String newHomeAddress);

    /**
     * 修改电话号码
     * @param telNumber
     */
    void changeOfficeTel(String telNumber);
}
