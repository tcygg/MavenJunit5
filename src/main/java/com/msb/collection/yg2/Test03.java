package com.msb.collection.yg2;

import java.util.TreeSet;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 15:11
 * @Description: com.msb.collection.yg2
 * @version: 1.0
 */
public class Test03 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建一个TreeSet:
        TreeSet<TestStudent> ts = new TreeSet<>();
        ts.add(new TestStudent(10,"elili"));
        ts.add(new TestStudent(8,"blili"));
        ts.add(new TestStudent(4,"alili"));
        ts.add(new TestStudent(9,"elili"));
        ts.add(new TestStudent(10,"flili"));
        ts.add(new TestStudent(1,"dlili"));
        System.out.println(ts.size());
        System.out.println(ts);
    }
}
