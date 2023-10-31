package com.msb.duoxiancheng;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/9 - 10 - 09 - 09:49
 * @Description: com.msb.duoxiancheng
 * @version: 1.0
 */
public class ceshi01 extends Thread{


    public ceshi01(String name) {


        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+i);
//            System.out.println(i);


        }
    }
}
