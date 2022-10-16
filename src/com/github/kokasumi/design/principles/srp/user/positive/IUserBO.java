package com.github.kokasumi.design.principles.srp.user.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 14:37
 * @description 用户属性维护，业务对象
 * @since v1.0
 */
public interface IUserBO {
    /**
     * 设置用户id
     * @param userID
     */
    void setUserID(String userID);

    /**
     * 获取用户id
     * @return
     */
    String getUserID();

    /**
     * 设置用户密码
     * @param password
     */
    void setPassword(String password);

    /**
     * 获取用户密码
     * @return
     */
    String getPassword();

    /**
     * 设置用户名
     * @param userName
     */
    void setUserName(String userName);

    /**
     * 获取用户名
     * @return
     */
    String getUserName();
}
