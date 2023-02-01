package com.ceshiren.lianxi;

import java.util.Arrays;

/**
 * @Auther: zhaoss
 * @Date: 2022/11/22 - 11 - 22 - 00:10
 * @Description: com.ceshiren
 * @version: 1.0
 */
public class ArrayPaixu {

    public static void main(String[] args) {


        int array1 []={5,2,3,4};
        Arrays.sort(array1);
        int [] aa2= array1;

        System.out.println(array1[3]);
        System.out.println(aa2[3]);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
//        for (int i : array1){
//            System.out.println(i);
//        }
        System.out.println("fhjhfje");
        int[] arr = {4,3,5,1,2,9,3,0};
        Arrays.sort(arr,1,4);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

        System.out.println(Arrays.toString(arr));



    }
}
