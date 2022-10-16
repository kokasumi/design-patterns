package com.github.kokasumi.design.principles.srp.user.positive;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 14:46
 * @description
 * @since v1.0
 */
public class Main {
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        // 作为用户属性业务对象维护
        IUserBO userBO = userInfo;
        userBO.setPassword("123232");
        // 执行业务逻辑
        IUserBiz userBiz = userInfo;
        userBiz.deleteUser(userBO);
    }
}
