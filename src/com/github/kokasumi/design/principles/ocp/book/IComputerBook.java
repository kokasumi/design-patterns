package com.github.kokasumi.design.principles.ocp.book;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/21 1:59
 * @description
 * @since v1.0
 */
public interface IComputerBook extends IBook{
    /**
     * 获取书籍领域
     * @return
     */
    String getScope();
}
