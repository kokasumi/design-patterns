package com.github.kokasumi.design.principles.ocp.book;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/21 1:50
 * @description
 * @since v1.0
 */
public class OffNovelBook extends NovelBook{
    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        int selfPrice = super.getPrice();
        int offPrice = 0;
        if(selfPrice > 4000) {
            // 原价 > 40，打9折
            offPrice = selfPrice * 90 / 100;
        }else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
