package com.github.kokasumi.design.principles.srp.user.dependency;

import com.github.kokasumi.design.principles.srp.user.positive.IUserBO;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 15:47
 * @description 用户行为接口实现类
 * @since v1.0
 */
public class UserBiz implements IUserBiz{
    @Override
    public boolean changePassword(IUserBO userBO, String oldPassword, String newPassword) {
        if(!oldPassword.equals(userBO.getPassword())) {
            System.out.println("旧密码不正确");
            return false;
        }
        userBO.setPassword(newPassword);
        return true;
    }

    @Override
    public boolean deleteUser(IUserBO userBO) {
        System.out.println("成功删除用户" + userBO.getUserID());
        return true;
    }
}
