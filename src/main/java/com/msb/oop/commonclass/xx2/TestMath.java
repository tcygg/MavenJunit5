package com.msb.oop.commonclass.xx2;

import java.util.Arrays;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/18 - 09 - 18 - 20:04
 * @Description: com.msb.oop.commonclass.xx2
 * @version: 1.0
 */
public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println("随机数："+Math.random()*3);//[0.0,1.0)
        System.out.println("绝对值："+Math.abs(-80));
        System.out.println("向上取值："+Math.ceil(9.1));
        System.out.println("向下取值："+Math.floor(9.9));
        System.out.println("四舍五入："+Math.round(3.5));
        System.out.println("取大的那个值："+Math.max(3, 6));
        System.out.println("取小的那个值："+Math.min(3, 6));
        String s6 = new String("abc");
        String s7 = new String("abc");
        System.out.println(s6.equals(s7));

        String s8 = new String("abcde");
        String s9 = new String("abdd");
        System.out.println(s8.compareTo(s9));
        String s11 = "abcdeahija";
        System.out.println(s11.replace('a', 'u'));
        String s12 = "a-b-c-d-e-f";
        String[] strs = s12.split("-");
        System.out.println(Arrays.toString(strs));
        String s13 = "abc";
        System.out.println(s13.toUpperCase());
        System.out.println(s13.toUpperCase().toLowerCase());

        //去除收尾空格：
        String s14 = "    a  b  c    ";
        System.out.println(s14.trim());
        //toString()
        String s15 = "abc";
        System.out.println(s15.toString());
        //转换为String类型：
        System.out.println(String.valueOf(false));

        int aa =9;
        System.out.println(String.valueOf(aa).getClass());
        System.out.println(aa);

    }
}
