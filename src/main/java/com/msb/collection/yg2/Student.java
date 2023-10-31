package com.msb.collection.yg2;

import java.util.Objects;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 11:19
 * @Description: com.msb.collection.yg2
 * @version: 1.0
 */
public class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
