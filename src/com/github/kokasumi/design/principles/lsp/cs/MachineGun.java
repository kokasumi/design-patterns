package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 0:29
 * @description
 * @since v1.0
 */
public class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("机枪射击...");
    }
}
