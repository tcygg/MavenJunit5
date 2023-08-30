package com.msb.oop.test1.xx5;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/24 - 08 - 24 - 09:32
 * @Description: com.msb.oop.test1.xx5
 * @version: 1.0
 */
public class Xusong {
    private int age =11;
    public int age1 =11111111;

    private double height;
    private String name;

    public Xusong() {
    }

    public Xusong(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void shuxing(){
        System.out.println("wo ai xu song");
    }
    public void eat(){
        System.out.println("wo ai xu song");
    }
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
    }

}
