package com.github.kokasumi.design.principles.ocp.book;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/21 1:17
 * @description
 * @since v1.0
 */
public interface IBook {
    /**
     * 获取书名
     * @return
     */
    String getName();

    /**
     * 获取书价
     * @return
     */
    int getPrice();

    /**
     * 获取作者
     * @return
     */
    String getAuthor();
}
