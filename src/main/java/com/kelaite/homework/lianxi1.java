package com.kelaite.homework;

import java.util.Scanner;

/**
 * @Auther: zhaoss
 * @Date: 2023/7/24 - 07 - 24 - 12:44
 * @Description: com.kelaite.homework
 * @version: 1.0
 */
public class lianxi1 {
    public static int IndexOne = 1;



    public static void main(String[] args){
        //功能：给定一个数组,在数组下标为2的位置上添加一个元素91

        //1.给定一个数组：
        int[] arr = {12,34,56,7,3,10,55,66,77,88,999,89};
        //           0  1   2 3 4 5
        //2.输出增加元素前的数组：
        System.out.print("增加元素前的数组：");
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }else{//i==arr.length-1 最后一个元素不用加,
                System.out.print(arr[i]);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入你要添加的账号：");
        int index = sc.nextInt();


        insertEle(arr,index);

        System.out.println("请录入你要添加的账号：");
        int bb = sc.nextInt();
        index = bb;
        insertEle(arr,index);




        //4.输出增加元素后的数组：
        System.out.print("\n增加元素后的数组：");
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }else{//i==arr.length-1 最后一个元素不用加,
                System.out.print(arr[i]);
            }
        }
    }

    public static void insertEle(int[] arr,int pwd){

        arr[IndexOne] = pwd;
        IndexOne = IndexOne + 1;
    }

}

