package com.msb.duoxiancheng;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/10 - 10 - 10 - 09:51
 * @Description: com.msb.duoxiancheng
 * @version: 1.0
 */
public class huochepiaoTread extends Thread{
    public huochepiaoTread(String name){
        super(name);
    }

    static int ticketNum = 10;
    @Override
    public void run() {


        for (int i = 0; i < 10; i++) {
            if(ticketNum > 0) {
                System.out.println("我在" + this.getName() + "买到了从北京到哈尔滨的第" + ticketNum-- + "张车票");
            }

        }
    }
}
