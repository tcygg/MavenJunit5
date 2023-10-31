package com.msb.duoxiancheng;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/10 - 10 - 10 - 10:02
 * @Description: com.msb.duoxiancheng
 * @version: 1.0
 */
public class runTest implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
