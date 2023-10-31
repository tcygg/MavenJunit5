package com.msb.oop.commonclass.xx2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/18 - 09 - 18 - 19:35
 * @Description: com.msb.oop.commonclass.xx2
 * @version: 1.0
 */
public class TestLocal01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate of = LocalDate.of(2023, 5, 6);
        LocalDateTime yg = LocalDateTime.now();
        System.out.println(yg.getYear());//2020
        System.out.println(localDateTime.getMonth());//JUNE
        System.out.println(localDateTime.getMonthValue());//6
        System.out.println(localDateTime.getDayOfMonth());//14
        System.out.println(localDateTime.getDayOfWeek());//SUNDAY
        System.out.println(localDateTime.getHour());//22
        System.out.println(localDateTime.getMinute());//22
        System.out.println(localDateTime.getSecond());//6

    }
}
