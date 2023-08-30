package com.msb.oop.fengzhuang.xx11;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/25 - 08 - 25 - 18:30
 * @Description: com.msb.oop.fengzhuang.xx11
 * @version: 1.0
 */
public class Boy {
    int age;
    String name;
    //方法：
    public void buy(){
        System.out.println("跟我谈恋爱，我给你买买买。。。");
    }
    //构造器：
    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
