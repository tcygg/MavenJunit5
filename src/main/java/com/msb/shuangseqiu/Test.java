package com.msb.shuangseqiu;

import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/19 - 10 - 19 - 16:18
 * @Description: com.msb.shuangseqiu
 * @version: 1.0
 */
public class Test {


    public static void main(String[] args) {


        int[] balls = new int[7];
        int count = 0;



        while (true) {
            System.out.println("------欢迎进入双色球彩票系统---------");
            System.out.println("1.购买彩票");
            System.out.println("2.查看开奖");
//            System.out.println("3.查看你买的号码");
            System.out.println("3.退出");


            System.out.println("请选择你要完成的功能：");

            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();
//            int[] shuzu1 = new int[7];


            switch (choice) {


                case 1:
                    System.out.println("双色球系统》》购买彩票");
                    System.out.println("请选择你要购买几注：");
                    count = sc.nextInt();



                   /* for (int i = 1; i < 7; i++) {
                        if(i<7) {
                            System.out.println("您购买的第" + i + "个红球为:");
                        }else {
                            System.out.println("您购买的第" + i + "个蓝球为:");
                        }
                        int i1 = sc.nextInt();
                        shuzu1[i] =i1;

                    }*/
                    for (int i = 1; i <= 7; i++) {
                        if (i != 7) {//录入红色球
                            System.out.println("请录入第" + i + "个红球：");
                            int redBall = sc.nextInt();
                            balls[i - 1] = redBall;
                        } else {//i==7  录入蓝色球
                            System.out.println("请录入一个蓝色球：");
                            int blueBall = sc.nextInt();
                            balls[6] = blueBall;
                        }
                    }
                    System.out.println("您购买了" + count + "注彩票,一共消费了" + count * 2 + "元钱,您购买的彩票号码为：");
                    for (int i1 : balls) {
                        System.out.print(i1 + "\t");

                    }


                    break;
                case 2:
                    System.out.println("双色球系统》》查看开奖");

                    int[] luckBall = getLuckBall();

                    int level = getLevel(balls, luckBall);
                    switch (level) {
                        case 1:
                            System.out.println("恭喜你，中了1等奖，1注奖金500万，您一共获得：" + 500 * count + "万元");
                            break;
                        case 2:
                            System.out.println("恭喜你，中了2等奖，1注奖金100万，您一共获得：" + 100 * count + "万元");
                            break;
                        case 3:
                            System.out.println("恭喜你，中了3等奖，1注奖金30万，您一共获得：" + 30 * count + "万元");
                            break;
                        case 4:
                            System.out.println("恭喜你，中了4等奖，1注奖金5万，您一共获得：" + 5 * count + "万元");
                            break;
                        case 5:
                            System.out.println("恭喜你，中了5等奖，1注奖金2000千元，您一共获得：" + 2000 * count + "元");
                            break;
                        case 6:
                            System.out.println("恭喜你，中了6等奖，1注奖金5元，您一共获得：" + 5 * count + "元");
                            break;
                    }


                    break;

                /*case 3:
                    for (int i1 : shuzu1) {
                        System.out.print(i1+" ");

                    }
                    break;*/

                case 3:
                    System.out.println("双色球系统》》退出");

                    return;


                default:
                    System.out.println("欢迎使用啦啦啦");
//                throw new IllegalStateException("Unexpected value: " + choice);
            }

        }
    }

    //定义一个方法，专门用来生成中奖号码：
    public static int[] getLuckBall() {
        int[] luckBall = {1, 2, 3, 4, 5, 6, 7};


        /*
        红球：1-33
        篮球：1-16
        1-33
        Math.random() -> [0.0,1.0)
        Math.random()*33 -> [0.0,33.0)
        (int)(Math.random()*33) -> [0,32]
        (int)(Math.random()*33)+1 ->[1,33]
         */
     /*   int[] luckBall = new int[7];

        for(int i = 1;i<=7;i++){
            if(i!=7){//给红球赋值
                luckBall[i-1] = (int)(Math.random()*2)+1;
            }else{//i==7  给蓝色球赋值：
                luckBall[6] = (int)(Math.random()*2)+1;
            }
        }*/
        for (int i : luckBall) {
            System.out.print(i+" ");

        }

        return luckBall;
    }

    //定义一个方法，专门用来比对 购买号码和中奖号码的：
    public static int getLevel(int[] balls, int[] luckBall) {
        int level = 1;
        //计数器：用来计红球有几个相等：
        int redCount = 0;
        //计数器：用来计篮球有几个相等：
        int blueCount = 0;
        //就是将我们的球一个一个的跟中奖号码比对：
        //遍历我购买的号码
        for(int i = 0;i<=6;i++){
            if(i!=6){//i:0-5 红球  比对红球
                for(int j = 0;j<=5;j++){
                    if(balls[i]==luckBall[j]){
                        redCount++;
                    }
                }
            }else{//i:6 ->蓝色球
                if(balls[6]==luckBall[6]){
                    blueCount++;
                }
            }
        }
        //输出比对结果：
        System.out.println("红球有"+redCount+"个相等");
        System.out.println("蓝球有"+blueCount+"个相等");
        //根据红球和篮球的相等数量得到level的具体结果：
        if(redCount==6&&blueCount==1){
            level = 1;
        }else if(redCount==6){
            level = 2;
        }else if(redCount==5&&blueCount==1){
            level = 3;
        }else if(redCount==5||(redCount==4&&blueCount==1)){
            level = 4;
        }else if(redCount==4||(redCount==3&&blueCount==1)){
            level = 5;
        }else{
            level = 6;
        }
        return level;
    }
    }
