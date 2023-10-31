package com.msb.oop.commonclass.xx2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/18 - 09 - 18 - 14:30
 * @Description: com.msb.oop.commonclass.xx2
 * @version: 1.0
 */
public class Test001 {
   /* cal.get(Calendar.YEAR);//获取年
    (cal.get(Calendar.MONTH)+1);//月份 要加1，因为不加1是从0开始
    Calendar.DATE; //日期
    Calendar.DAY_OF_MONTH; //日期，和上面的字段意义完全相同
    Calendar.HOUR;//小时制的小时 12
    Calendar.HOUR_OF_DAY; //24小时制的小时
    Calendar.MINUTEb;// 分钟
    Calendar.SECOND; // 秒
    Calendar.DAY_OF_WEEK; //星期几*/

    public static void main(String[] args) {

        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(1));

        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.getActualMaximum(Calendar.DATE));//获取当月日期的最大天数
        System.out.println(cal.getActualMinimum(Calendar.DATE));//获取当月日期的最小天数

        Date aa = new Date();
        System.out.println(aa);

        cal.set(Calendar.YEAR,1990);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DATE,16);
        System.out.println(cal);

    }
}
