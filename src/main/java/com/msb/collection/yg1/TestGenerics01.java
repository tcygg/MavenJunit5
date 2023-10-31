package com.msb.collection.yg1;

import java.util.ArrayList;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/19 - 09 - 19 - 20:02
 * @Description: com.msb.collection.yg1
 * @version: 1.0
 */
public class TestGenerics01 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(98);
        al.add(18);
        al.add(39);
        al.add(60);
        al.add(83);
        al.add("丽丽");
        System.out.println(al);

        for (Object obj:al) {
            System.out.println(obj);

        }
        System.out.println(al.get(2).getClass());
        System.out.println(al.get(5).getClass());



    }
}
