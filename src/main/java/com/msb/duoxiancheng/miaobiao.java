package com.msb.duoxiancheng;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/16 - 10 - 16 - 16:21
 * @Description: com.msb.duoxiancheng
 * @version: 1.0
 */
public class miaobiao {
    public static void main(String[] args) {


    /*    Date date = new Date();
        System.out.println(date);


        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        String aa = df.format(date);


        System.out.println(aa);*/

        DateFormat df = new SimpleDateFormat("HH:mm:ss");

        while(true){
            //1.获取当前时间：
            Date d = new Date();
            //3.按照上面定义的格式将Date类型转为指定格式的字符串：
            System.out.println(df.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}}
