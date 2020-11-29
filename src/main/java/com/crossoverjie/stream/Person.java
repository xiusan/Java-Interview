package com.crossoverjie.stream;

import java.util.List;

/**
 * Created by xiaojinlu1990@163.com on 2020/11/29 0029.
 */

public class Person {

    private String name;
    private Integer age;
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
