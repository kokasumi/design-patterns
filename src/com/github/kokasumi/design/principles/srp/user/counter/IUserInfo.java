package com.github.kokasumi.design.principles.srp.user.counter;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/15 23:28
 * @description 不遵循单一职责原则的反例
 * @since v1.0
 */
public interface IUserInfo {
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

    /**
     * 修改用户密码
     * @param oldPassword
     * @param newPassword
     * @return
     */
    boolean changePassword(String oldPassword,String newPassword);

    /**
     * 删除用户
     * @return
     */
    boolean deleteUser();
}
