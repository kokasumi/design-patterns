package com.github.kokasumi.design.principles.lod.counter;

import java.util.List;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/20 22:34
 * @description 班级
 * @since v1.0
 */
public class Class {
    /**
     * 班级id
     */
    private Long id;

    /**
     * 班级名
     */
    private String name;

    /**
     * 学生
     */
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
