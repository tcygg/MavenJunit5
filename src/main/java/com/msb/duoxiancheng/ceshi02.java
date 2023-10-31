package com.msb.duoxiancheng;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/9 - 10 - 09 - 09:51
 * @Description: com.msb.duoxiancheng
 * @version: 1.0
 */
public class ceshi02 {


    public static void main(String[] args) {

        Thread.currentThread().setName("主线程");

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"1-------"+i);
        }

        ceshi01 tt = new ceshi01("子线程");
//        tt.setName("子线程");

//        tt.run();
        tt.start();


        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"2-------"+i);
        }
        //性能太好,可以加大数量
    }
}
