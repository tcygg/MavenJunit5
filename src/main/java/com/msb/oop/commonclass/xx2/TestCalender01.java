package com.msb.oop.commonclass.xx2;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/18 - 09 - 18 - 14:53
 * @Description: com.msb.oop.commonclass.xx2
 * @version: 1.0
 * 日期选择器 2023-09-17
 */
public class TestCalender01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要查看的日期：（提示：请按照例如2012-5-6的格式书写）");

        String strDate=sc.next();
        System.out.println(strDate);
        java.sql.Date date = java.sql.Date.valueOf(strDate);
//        java.sql.Date date = java.sql.Date.valueOf("2023-9-18");

        System.out.println(date);


        Calendar cal = Calendar.getInstance();
        cal.setTime(date);


        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        //获取本月的最大天数：
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当前日期中的日：
        int nowDay = cal.get(Calendar.DATE);
        //将日期调为本月的1号：
        cal.set(Calendar.DATE,1);
        //获取这个一号是本周的第几天：
        int num = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(num);
        //引入一个计数器：
        int count = 0;//计数器最开始值为0
        int day = num - 1;
        for (int i = 1; i <= day; i++) {
            System.out.print("\t");
        }
        count = count + day;
//        System.out.println(count);
        for (int i = 1; i < maxDay; i++) {
            if(i==nowDay){
                System.out.print(i+"*"+"\t");

            }else {
            System.out.print(i+"\t");
            }
            count++;
            if (count%7==0){
                System.out.println();
            }

        }


//        2020-5-6


    }
}
