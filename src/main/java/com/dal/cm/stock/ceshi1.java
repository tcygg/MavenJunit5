package com.dal.cm.stock;

import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/9 - 08 - 09 - 20:29
 * @Description: com.dal.cm.stock
 * @version: 1.0
 */
public class ceshi1 {
    public static void main(String[] args) {
        //实现一个功能：键盘录入两个数，求商：
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = sc.nextInt();
            System.out.println("商："+num1/num2);
        }catch (ArithmeticException ex){
            System.out.println(555);
        }catch(Exception ex){
           /* //第一种处理：什么都不写，什么都不做
            //第二种处理：输出自定义异常信息
            System.out.println("对不起，你的代码有问题！");
            //第三种处理：打印异常信息：
            (1)调用toString方法，显示异常的类名（全限定路径）
            System.out.println(ex);
            System.out.println(ex.toString());
            (2)显示异常描述信息对应的字符串，如果没有就显示null
            System.out.println(ex.getMessage());
            (3)显示异常的堆栈信息：将异常信息捕获以后，在控制台将异常的效果给我们展示出来，方便我们查看异常
             ex.printStackTrace();
            //第四种处理：抛出异常：*/
                System.out.println(ex);
                System.out.println(ex.toString());
                System.out.println(ex.getMessage());

                ex.printStackTrace();


//            throw ex;

        }finally {
            System.out.println("----谢谢你使用计算器111");
        }
        System.out.println("----谢谢你使用计算器111");
    }

/*    public static void main(String[] args) {
        //实现一个功能：键盘录入两个数，求商：
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请录入第二个数：");
            int num2 = sc.nextInt();
            System.out.println("商："+num1/num2);
        }catch(Exception ex){
            System.out.println("对不起，程序出现异常！");
        }
        System.out.println("----谢谢你使用计算器111");
        System.out.println("----谢谢你使用计算器222");
        System.out.println("----谢谢你使用计算器333");
        System.out.println("----谢谢你使用计算器444");
        System.out.println("----谢谢你使用计算器555");
        System.out.println("----谢谢你使用计算器666");
    }*/
}
