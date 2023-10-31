package com.msb.oop.commonclass.xx1;


//import java.util.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/6 - 09 - 06 - 18:38
 * @Description: com.msb.oop.commonclass.xx1
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        //日期转换：
        //SimpleDateFormat(子类) extends DateFormat（父类是一个抽象类）
        //格式化的标准已经定义好了：
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String--->Date
        try {
            Date d = df.parse("2019-4-6 12:23:54");
            System.out.println(d);
            System.out.println(d.getClass());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Date--->String
        String format = df.format(new Date());
        System.out.println(format);
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());

        try {
            Date d1 = df.parse("2019-4-6 12:23:54");
            System.out.println(d1);
            System.out.println(d1.getClass());
            String format1 = df.format(d1);
            System.out.println(format1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date aa = new Date();
        System.out.println(aa);
        System.out.println("dfjjgdfhjgf");
        System.out.println(System.currentTimeMillis());
        Long qq =System.currentTimeMillis();

        String format2 = df.format(qq);
        System.out.println(format2);

    }


    }


