package com.msb.oop.fengzhuang.xx11;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/25 - 08 - 25 - 18:30
 * @Description: com.msb.oop.fengzhuang.xx11
 * @version: 1.0
 */
public class ceshi1 {

    public static void main(String[] args) {
        Boy boy = new Boy(30,"鹿晗");
        Girl girl = new Girl("关晓彤",100);

        girl.love(boy);

        System.out.println(girl.name);
//        girl.m.say();

        girl.wechat();

    }
}
