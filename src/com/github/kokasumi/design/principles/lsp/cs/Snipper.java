package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 1:27
 * @description
 * @since v1.0
 */
public class Snipper {
    private AUG aug;

    public void setAug(AUG aug) {
        this.aug = aug;
    }

    public void killEnemy() {
        aug.zoomOut();
        aug.shoot();
    }
}
