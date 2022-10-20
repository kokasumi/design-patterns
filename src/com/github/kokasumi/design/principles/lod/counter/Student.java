package com.github.kokasumi.design.principles.lod.counter;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/20 22:33
 * @description
 * @since v1.0
 */
public class Student {
    /**
     * 学生id
     */
    private Long id;

    /**
     * 学生姓名
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
