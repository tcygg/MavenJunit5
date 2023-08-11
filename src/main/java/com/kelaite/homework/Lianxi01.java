package com.kelaite.homework;

import java.util.Arrays;

/**
 * @Auther: zhaoss
 * @Date: 2023/8/7 - 08 - 07 - 10:48
 * @Description: com.kelaite.homework
 * @version: 1.0
 */
public class Lianxi01 {
    public static void main(String[] args) {
        //定义一个二维数组：
        int[][] arr = new int[3][];//本质上定义了一个一维数组，长度为3

        int[] a1 = {1,2,3};
        arr[0] = a1;

        arr[1] = new int[]{4,5,6,7};

        arr[2] = new int[]{9,10};

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[0]);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
