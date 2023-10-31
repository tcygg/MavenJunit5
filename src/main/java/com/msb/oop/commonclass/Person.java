package com.msb.oop.commonclass;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/5 - 09 - 05 - 09:51
 * @Description: com.msb.oop.commonclass
 * @version: 1.0
 */
public class Person {
    private Integer age;
    Integer i1 = new Integer(112);
    private String name;
    private Double weight;

    public Person(Integer age, String name, Double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
