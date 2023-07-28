package com.msb.lianxi.xx2;

/**
 * @Auther: zhaoss
 * @Date: 2023/6/27 - 06 - 27 - 12:12
 * @Description: com.msb.lianxi.xx2
 * @version: 1.0
 */
public class ceshi2 {
    public static void main(String[] args) {


        for (int k = 0; k < 100; k++) {
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                   if((k+i+j ==100)&&(5 * k + 3 * i + j / 3 == 100)){
                       System.out.println(k + "\t" + i + "\t" + j);
                   }

                }

            }

        }

    }
}
