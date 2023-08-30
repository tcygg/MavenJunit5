package com.kelaite.homework;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/14 - 08 - 14 - 13:21
 * @Description: com.kelaite.homework
 * @version: 1.0
 */
public class Test001 {
    public static void main(String[] args) {
        Person2 zx =new Person2();
        System.out.println(zx.height1);

        zx.eat();
        change3(zx);

        Person2 xusong =new Person2(12.3,12.3);
        System.out.println(xusong.height1);
        System.out.println(xusong);

    }
    public static void change3(Person2 p){
        p.eat();
    }

}
