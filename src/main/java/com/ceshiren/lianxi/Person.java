package com.ceshiren.lianxi;

/**
 * @Auther: zhaoss
 * @Date: 2022/11/20 - 11 - 20 - 15:33
 * @Description: com.ceshiren
 * @version: 1.0
 */
public class Person {
    int age;
    double weight;
    double height;
    String name;
    public int add(int num1,int num2){
        int sum=0;
        sum+=num1;
        sum+=num2;
        return sum;

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Person(int age, double weight, double height, String name) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }
}
