package com.msb.testenum;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 21:19
 * @Description: com.msb.testenum
 * @version: 1.0
 */
public class Person {

    //属性：
    private int age;
    private String name;
    private Gender sex;
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
    public Gender getSex() {
        return sex;
    }
    public void setSex(Gender sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
