package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 0:28
 * @description
 * @since v1.0
 */
public class Rifle extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("步枪射击...");
    }
}
