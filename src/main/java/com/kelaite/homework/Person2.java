package com.kelaite.homework;

/**
 * @Auther: zhaoss
 * @Date: 2023/7/25 - 07 - 25 - 21:08
 * @Description: com.kelaite.homework
 * @version: 1.0
 */
public class Person2 {
    String cardId;
    String pwd;
    int age ;//年龄
    String name;//姓名
    double height;//身高
    double weight;//体重
    //动词---》方法
    //吃饭
    public void eat(){
        int num = 10;//局部变量：放在方法中
        System.out.println("我喜欢吃饭");
    }
    //睡觉：
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
    }
    //自我介绍：
    public String introduce(){
        return "我的名字是："+name+"，我的年龄是："+age+",我的身高是："+height+",我的体重是："+weight;
    }

    public Person2() {
    }

    public Person2(String cardId, String pwd, int age, String name, double height, double weight) {
        this.cardId = cardId;
        this.pwd = pwd;
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Person2(int age, String name, double height, double weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "cardId='" + cardId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
