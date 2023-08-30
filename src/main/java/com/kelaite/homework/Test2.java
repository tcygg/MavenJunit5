package com.kelaite.homework;

import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/14 - 08 - 14 - 09:51
 * @Description: com.kelaite.homework
 * @version: 1.0
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //实现一个功能：两个数相除，当除数为0的时候，程序出现异常。
        /*try {
            devide();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        devide();
    }
    public static void devide() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请录入第二个数：");
        int num2 = sc.nextInt();
        if(num2 == 0 ){//除数为0 ，制造异常。
            //制造运行时异常：
            /*throw new RuntimeException();*/
            //制造检查异常：
            /*try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
//            throw new Exception("测试异常名称");
            throw  new MyException01("测试异常名称");

        }else{
            System.out.println("商："+num1/num2);
        }
    }
}
