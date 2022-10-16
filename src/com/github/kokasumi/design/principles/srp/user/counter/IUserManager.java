package com.github.kokasumi.design.principles.srp.user.counter;

import com.github.kokasumi.design.principles.srp.user.positive.IUserBO;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 18:27
 * @description
 * @since v1.0
 */
public interface IUserManager {
    /**
     * 修改用户信息
     * @param userBO
     * @param changeOptions
     */
    void changeUser(IUserBO userBO, String... changeOptions);
}
