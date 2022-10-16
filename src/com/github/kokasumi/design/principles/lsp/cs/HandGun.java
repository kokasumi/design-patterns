package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 0:27
 * @description 手枪
 * @since v1.0
 */
public class HandGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪射击...");
    }
}
