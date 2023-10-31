package com.msb.duoxiancheng;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/10 - 10 - 10 - 10:03
 * @Description: com.msb.duoxiancheng
 * @version: 1.0
 */
public class runceshi {
    public static void main(String[] args) {
        runTest tt = new runTest();
        Thread t = new Thread(tt,"子线程");
        t.start();



        //主线程里面也是打印1-10数字：
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }


    }
}
