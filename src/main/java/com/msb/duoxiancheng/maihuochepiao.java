package com.msb.duoxiancheng;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/10 - 10 - 10 - 09:50
 * @Description: com.msb.duoxiancheng
 * @version: 1.0
 */
public class maihuochepiao {
    public static void main(String[] args) {
        //多个窗口抢票：三个窗口三个线程对象：
        huochepiaoTread t1 = new huochepiaoTread("窗口1");
        t1.start();
        huochepiaoTread t2 = new huochepiaoTread("窗口2");
        t2.start();
        huochepiaoTread t3 = new huochepiaoTread("窗口3");
        t3.start();
    }
}
