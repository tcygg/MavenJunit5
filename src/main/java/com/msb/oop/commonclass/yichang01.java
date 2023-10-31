package com.msb.oop.commonclass;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/5 - 09 - 05 - 09:06
 * @Description: com.msb.oop.commonclass
 * @version: 1.0
 */
public class yichang01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.msb.test01.Test").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
