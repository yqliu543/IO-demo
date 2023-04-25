package com.towery.objectstream;

import java.io.Serializable;

/**
 * @Description:
 * @author: 刘
 * @date: 2023年04月25日 下午 3:38
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 4074108488443603256L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
