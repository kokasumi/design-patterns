package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 0:29
 * @description
 * @since v1.0
 */
public class Soldier {
    private AbstractGun gun;

    /**
     * 发放枪支
     * @param gun
     */
    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }
}
