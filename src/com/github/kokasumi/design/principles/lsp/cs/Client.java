package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 0:30
 * @description
 * @since v1.0
 */
public class Client {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        // 发放枪支
        soldier.setGun(new Rifle());
        soldier.killEnemy();
    }
}
