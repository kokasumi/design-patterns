package com.github.kokasumi.design.principles.lod.positive;

import java.util.List;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/20 22:36
 * @description
 * @since v1.0
 */
public class School {
    /**
     * 班级列表
     */
    private List<Class>  classes;

    /**
     * 打印全校学生名
     */
    public void printStudents() {
        classes.forEach(aClass -> {
            // 打印班级名
            System.out.println(aClass.getName());
            // 打印学生名
            aClass.printStudents();
        });
    }
}
