package com.github.kokasumi.design.principles.srp.user.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 14:46
 * @description
 * @since v1.0
 */
public class UserInfo implements IUserInfo{
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

    @Override
    public boolean changePassword(IUserBO userBO, String oldPassword, String newPassword) {
        if(!oldPassword.equals(userBO.getPassword())) {
            System.out.println("旧密码不正确");
            return false;
        }
        setPassword(newPassword);
        return true;
    }

    @Override
    public boolean deleteUser(IUserBO userBO) {
        System.out.println("成功删除用户" + userBO.getUserID());
        return true;
    }
}
