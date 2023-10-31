package com.msb.collection.yg2;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 15:08
 * @Description: com.msb.collection.yg2
 * @version: 1.0
 */
public class TestStudent implements Comparable<TestStudent>{
//public class TestStudent{


        private int age;
    private String name;

    public TestStudent() {
    }

    public TestStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(TestStudent o) {
        return this.getAge()-o.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
