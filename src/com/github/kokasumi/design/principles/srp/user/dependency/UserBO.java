package com.github.kokasumi.design.principles.srp.user.dependency;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 15:29
 * @description 用户业务属性实现类
 * @since v1.0
 */
public class UserBO implements IUserBO{
    private String userID;
    private String password;
    private String userName;

    @Override
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String getUserID() {
        return userID;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
