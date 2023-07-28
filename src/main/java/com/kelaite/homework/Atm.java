package com.kelaite.homework;

import java.util.Scanner;

/**
 *
 * @author 小zz
 *创建时间2019年5月9日下午4:13:10
 *@version  1.0
 */
public class Atm {
    /**注：cardNos为卡号，passwords为对应的密码
     * userNames为对应的用户名，moneys为对应的余额
     * time用于限制输入账号和密码的次数
     * userIndex（下标）若为10则表示登陆失败，用于判断输入的账号是数组中的第几个，便于接下来的操作
     */
    public Scanner scanner  = new Scanner(System.in);
    public  String[] cardNos= {"123","456","111"};
    public  String[] passwords= {"112","223","121"};
    public  String[] userNames= {"小张","小小","张晓"};
    public  double[] moneys = {1000,2000,3000};
    public int userIndex = 10;
    public int time=3;


    /**主程序*/
    public static void main(String[] args) {
        Atm atm = new  Atm();
        /**执行启动atm  */
        atm.atmRun();
    }

    /**启动atm  */
    public void atmRun() {
            System.out.println("请输入卡号：");
            String cardNo = scanner.nextLine();
            System.out.println("请输入密码：");
            String pwd = scanner.nextLine();
            /**执行登录*/
            int userIndex= this.login(cardNo, pwd);
            /**判断是否登陆成功*/
            if(userIndex!=10) {
                /**执行功能菜单*/
                this.showMenu();
            }else {
                System.out.println("您输入的账号或密码有误");
            }



    }
    /**
     *
     * @param cardNo 卡号
     * @param pwd  密码
     * @return 整数 userIndex   userIndex:10 表示登录失败  否则为成功
     */
    public int login(String cardNo,String pwd) {
        /**循环判断账号是否存在*/
        for(int i=0;i<cardNos.length;i++) {
            if(cardNo.equals(cardNos[i])) {
                userIndex=i;
                break;
            }
        }
        /**继续判断密码是正确*/
        if(userIndex!=10) {
            /**正确*/
            if(pwd.equals(passwords[userIndex])) {
                return userIndex;
            }else {
                userIndex=10;
            }
        }
        return userIndex;
    }



    /**功能菜单*/
    public void showMenu() {
        time=0;
        int out=10;
        System.out.println("欢迎尊敬的VIP用户:  "+userNames[userIndex]);
        while(out==10) {
            System.out.println("请选择你的操作: 1 查询  2 取款 3 存款 4 转账 5 退出");
            int getNum=scanner.nextInt();
            switch (getNum) {
                case 1:System.out.println("您当前余额为："+moneys[userIndex]);
                    break;
                /**执行取款功能*/
                case 2:this.getMoneys();
                    break;
                /**执行存款功能*/
                case 3:this.savaMoney();
                    break;
                /**执行转账功能*/
                case 4:this.transMoneys();
                    break;
                case 5:	 System.out.println("退出成功！");
                    out=0;
            }
        }

    }


    /**取款功能*/
    public void getMoneys() {
        System.out.println("请输入您的取款金额：");
        int getMoney=scanner.nextInt();
        if(getMoney>moneys[userIndex]) {
            System.out.println("亲亲您的余额不足哦！！！");
            System.out.println("您的余额为："+moneys[userIndex]);
        }else {
            moneys[userIndex]-=getMoney;
            System.out.println("亲恭喜您成功取款"+getMoney+"   		您的余额为：  "+moneys[userIndex]);
        }
    }
    /**存款功能*/
    public void savaMoney() {
        System.out.println("请输入您的存款金额：");
        int savaMoney=scanner.nextInt();
        moneys[userIndex]+=savaMoney;
        System.out.println("亲恭喜您成功存款"+savaMoney+"				您的余额为：  "+moneys[userIndex]);
    }
    /**转账功能*/
    public void transMoneys() {
        /**注：hasUser用于判断转账用户是否存在，若为10则不存在
         * transIndex用于获取转账账号的下标
         */
        int hasUser=10;
        int transIndex=0;
        System.out.println("请输入转账的账号：");
        String transCard=scanner.next();
        for(int i=0;i<cardNos.length;i++) {
            if(transCard.equals(cardNos[i])) {
                hasUser=5;
                transIndex=i;
                break;
            }
        }
        if(hasUser==10) {
            System.out.println("亲亲，此账号不纯在哦！！");
        }else {
            System.out.println("请输入转账金额：");
            double transMoney=scanner.nextDouble();
            if(transMoney>moneys[userIndex]) {
                System.out.println("转账失败！！");
                System.out.println("失败原因：转账金额大于余额，您的余额为："+moneys[userIndex]);
            }else {
                transCard+=transMoney;
                moneys[userIndex]-=transMoney;
                System.out.println("成功向："+userNames[transIndex]+"转账："+transMoney);
                System.out.println("您剩余金额为："+moneys[userIndex]);
            }
        }
    }

}



