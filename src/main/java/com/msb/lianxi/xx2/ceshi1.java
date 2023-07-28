package com.msb.lianxi.xx2;

/**
 * @Auther: zhaoss
 * @Date: 2023/6/27 - 06 - 27 - 11:06
 * @Description: com.msb.lianxi.xx2
 * @version: 1.0
 */
public class ceshi1 {
    public static void main(String[] args) {


        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    if ((x + y + z == 100) && (5 * x + 3 * y + z / 3 == 100) && (z % 3 == 0)) {
                        System.out.println(x + "\t" + y + "\t" + z);
                    }
                }
            }
        }


    }

}