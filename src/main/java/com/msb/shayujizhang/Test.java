package com.msb.shayujizhang;

import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/19 - 10 - 19 - 15:18
 * @Description: com.msb.shayujizhang
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {

        //定义一个字符串，用来接收整个收支的明细：
        String details = "";
        //定义一个变量，接收余额：
        int balance = 0; //初始化金额为0元
        while (true) {

            System.out.println("-------欢迎使用小鲨鱼记账系统--------");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");
            System.out.println("请输入你要选择的功能：");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            while (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                System.out.println("对不起，你录入的功能错误，请重新录入：");
                int newChoice = sc.nextInt();
                choice = newChoice;
            }

            switch (choice) {
                case 1:
                    System.out.println("记账系统》》》》收支明细");

                  /*  System.out.println(details);
                    String s = details.substring(0, details.length() - 1);
                    System.out.println(s);*/

                    if(details!=""){
                        System.out.println(details.substring(0,details.length()-1));
                    }else{
                        System.out.print(details);
                    }
                    break;
                case 2:
                    System.out.println("记账系统》》》》登记收入");
                    System.out.println("请录入收入金额：");
                    int income = sc.nextInt();
                    System.out.println("请录入收入说明：");
                    String incomeDetail = sc.next();
                    balance += income;
                    details = details + "收入：" + income + ",收入说明：" + incomeDetail + ",账户余额：" + balance + "\n";
                    break;
                case 3:
                    System.out.println("记账系统》》》》登记支出");
                    System.out.println("请录入支出金额：");
                    int expend = sc.nextInt();
                    System.out.println("请录入支出说明：");
                    String expendDetail = sc.next();
                    balance -= expend;
                    details = details+"支出："+expend+",支出说明："+expendDetail+",账户余额："+balance+"\n";
                    break;

                case 4:
                    System.out.println("记账系统》》》》退出功能");
                    System.out.println("确定要退出吗？y/n:");
                    String isExit = sc.next();
                    switch (isExit) {
                        case "y":
                            System.out.println("系统退出，欢迎您下次继续使用！");
                            return;//结束当前方法
                    }
            }

        }
    }
}