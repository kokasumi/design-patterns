package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 1:25
 * @description AK47步枪
 * @since v1.0
 */
public class AK47 extends Rifle{
    @Override
    public void shoot() {
        System.out.println("AK47射击...");
    }
}
