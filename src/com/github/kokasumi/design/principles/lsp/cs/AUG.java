package com.github.kokasumi.design.principles.lsp.cs;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/17 1:25
 * @description
 * @since v1.0
 */
public class AUG extends Rifle{
    public void zoomOut() {
        System.out.println("通过望远镜查看敌人...");
    }

    @Override
    public void shoot() {
        System.out.println("AUG射击...");
    }
}
