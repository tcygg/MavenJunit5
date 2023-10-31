package com.msb.collection.yg2;

import java.util.HashSet;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 11:09
 * @Description: com.msb.collection.yg2
 * @version: 1.0
 */
public class TestSet01 {
    public static void main(String[] args) {
        //创建一个HashSet集合：
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(19,"lili"));
        hs.add(new Student(20,"lulu"));
        hs.add(new Student(18,"feifei"));
        hs.add(new Student(19,"lili"));
        hs.add(new Student(10,"nana"));
        System.out.println(hs.size());
        System.out.println(hs);
        String a = "B";
        String b = "A";
        System.out.println(a.compareTo(b));
        double a1 = 9.6;
        double b1 = 9.3;

        System.out.println(((Double) a1).compareTo((Double) b1));

    }
}
