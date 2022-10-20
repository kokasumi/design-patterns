package com.github.kokasumi.design.principles.ocp.book;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/21 1:20
 * @description
 * @since v1.0
 */
public class BookStore {
    private static final List<IBook> bookList = new ArrayList<>();
    static {
        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
        bookList.add(new NovelBook("巴黎圣母院", 5600, "雨果"));
        bookList.add(new NovelBook("悲惨世界", 3500, "雨果"));
    }

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("--------------书店卖出去的书籍记录如下：---------------");
        for (IBook book : bookList) {
            System.out.println("书籍名称：" + book.getName() + "\t书籍作者：" + book.getAuthor() + "\t书籍价格："
                    + format.format(book.getPrice() / 100.0) + "元");
        }
    }
}
