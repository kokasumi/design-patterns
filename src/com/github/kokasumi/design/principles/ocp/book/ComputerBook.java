package com.github.kokasumi.design.principles.ocp.book;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/21 1:59
 * @description
 * @since v1.0
 */
public class ComputerBook implements IComputerBook{
    private String name;
    private int price;
    private String author;
    private String scope;

    public ComputerBook(String name, int price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
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

    @Override
    public String getScope() {
        return scope;
    }
}
