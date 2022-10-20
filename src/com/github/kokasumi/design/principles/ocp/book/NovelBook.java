package com.github.kokasumi.design.principles.ocp.book;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/21 1:18
 * @description
 * @since v1.0
 */
public class NovelBook implements IBook{
    /**书籍名 */
    private String name;
    /** 书籍价格 */
    private int price;
    /** 书籍作者 */
    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
