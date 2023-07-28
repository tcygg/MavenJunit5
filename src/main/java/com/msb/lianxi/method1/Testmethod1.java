package com.msb.lianxi.method1;

/**
 * @Auther: zhaoss
 * @Date: 2023/6/27 - 06 - 27 - 13:05
 * @Description: com.msb.lianxi.method1
 * @version: 1.0
 */
public class Testmethod1 {
    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Testmethod1 sc = new Testmethod1();


            System.out.println("输出交换前的两个数：" + a + "---" + b);
            sc.changeNum(a, b);
//            changeNum(a, b);

            System.out.println("输出交换后的两个数：" + a + "---" + b);
        }
        public static void changeNum ( int num1, int num2){
            int t;
            t = num1;
            num1 = num2;
            num2 = t;
            a = num1;
            b =num2;
        }
    }

