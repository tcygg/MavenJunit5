package com.kelaite.homework;
/**
 * @Auther: zhaoss
 * @Date: 2023/7/24 - 07 - 24 - 02:02
 * @Description: com.kelaite.homework
 * @version: 1.0
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 孙少波
 * 7月20日 14:40
 * 做一个类似Atm_lianxi1的操作程序
 * 要求：
 * 可以输入账号密码进行登录
 * 可以存款提款
 * 可以查询剩余金额
 * 可以注册用户(
 */
public class Atm_lianxi1 {
    public static Scanner sc = new Scanner(System.in);
//    public String[] cardNos = {"123", "456", "111"};
//    public String[] passwords = {"1234", "223", "121"};
//    public String[] userNames = {"小张", "小小", "张晓"};

    public static String[] cardNos = new String[10];
    public static String[] passwords = new String[10];
    public static String[] userNames = new String[10];
    public static double[] moneys = new double[10];
    public static int userIndex = 10000;
    public static int IndexOne = 1;
    public static int out1 = 10;





    public static void main(String[] args) {
        Atm_lianxi1 Atm_lianxi1 = new Atm_lianxi1();
        while (out1 == 10) {
            System.out.println("1.登录账户 2.注册用户 3.退出 4.展示已注册账号密码");
            int getNum1 = sc.nextInt();
            switch (getNum1) {
                case 1:
                    Atm_lianxi1.Atm_lianxi1Run();
                    break;
                case 2:
                    Atm_lianxi1.insertCardNos();

                    Atm_lianxi1.Atm_lianxi1Run();
                    break;
                case 3:
                    System.out.println("再见!");
                    out1 = 0;
                    break;

                case 4:
                    System.out.println(Arrays.toString(cardNos));
                    System.out.println(Arrays.toString(passwords));
                    break;



                default:
                    System.out.println("宁的输入有误,请重新输入");
            }
        }
    }



    public static void insertCardNos(){
        System.out.println("请输入你的账号");
        String aa = sc.next();
        System.out.println("请输入你的密码");
        String bb = sc.next();
        System.out.println("请输入你的姓名");
        String cc = sc.next();



        cardNos[IndexOne] = aa;
        passwords[IndexOne] = bb;
        userNames[IndexOne] = cc;

        IndexOne = IndexOne + 1;
        System.out.println(Arrays.toString(cardNos));
    }



    public void Atm_zhuce(String aa,String bb,String cc) {
        System.out.println("请输入卡号：");
        String cardNo = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();
        int userIndex = this.login(cardNo, pwd);
        if (userIndex != 10000) {
            this.showMenu();
        } else {
            System.out.println("您输入的账号或密码有误");
        }

    }
    public void Atm_lianxi1Run() {
        System.out.println("欢迎操作ygg银行ATM操作系统");

        System.out.println("请输入卡号：");
        String cardNo = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();
        int userIndex = this.login(cardNo, pwd);
        if (userIndex != 10000) {
            this.showMenu();
        } else {
            System.out.println("您输入的账号或密码有误");
        }

    }

    public int login(String cardNo, String pwd) {
        for (int i = 0; i < cardNos.length; i++) {
            if (cardNo.equals(cardNos[i])) {
                userIndex = i;
                break;
            }
        }
        if (userIndex != 10000) {
            if (pwd.equals(passwords[userIndex])) {
                return userIndex;
            } else {
                userIndex = 10000;
            }
        }
        return userIndex;
    }

    public void showMenu() {
        int out = 10;
        System.out.println("欢迎尊敬的VIP用户:  " + userNames[userIndex]);
        while (out == 10) {
            System.out.println("请选择你的操作: 1 查询  2 取款 3 存款 4 退出");
            int getNum = sc.nextInt();
            switch (getNum) {
                case 1:
                    System.out.println("您当前余额为：" + moneys[userIndex]);
                    break;
                case 2:
                    this.getMoneys();
                    break;
                case 3:
                    this.savaMoney();
                    break;
                case 4:
                    System.out.println("退出成功！");
                    out = 0;


            }
        }

    }

    public void getMoneys() {
        System.out.println("请输入您的取款金额：");
        int getMoney = sc.nextInt();
        if (getMoney > moneys[userIndex]) {
            System.out.println("您的余额不足");
            System.out.println("您的余额为：" + moneys[userIndex]);
        } else {
            moneys[userIndex] -= getMoney;
            System.out.println("您成功取款" + getMoney + "   		您的余额为：  " + moneys[userIndex]);
        }
    }

    public void savaMoney() {
        System.out.println("请输入您的存款金额：");
        int savaMoney = sc.nextInt();
        moneys[userIndex] += savaMoney;
        System.out.println("您成功存款" + savaMoney + "			您的余额为：  " + moneys[userIndex]);
    }


}

