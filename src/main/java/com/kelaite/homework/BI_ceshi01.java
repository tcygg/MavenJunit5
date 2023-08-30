package com.kelaite.homework;


import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/21 - 08 - 21 - 22:32
 * @Description: com.kelaite.homework
 * @version: 1.0
 */
public class BI_ceshi01 {

    static int bb;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int getNum=sc.nextInt();

        System.out.println(run(getNum));

        BI_ceshi01.bb =676722;
        System.out.println(bb);



    }

    public static int run(int getNum) {

            switch (getNum) {
                case 1: {
                    System.out.println(111);
                    getNum =111111;
                    break;
                }
                case 2: {
                    System.out.println(222);
                    getNum =222222;
                    break;

                }
                case 3: {
                    System.out.println(333);
                    getNum =3333333;
                    break;


                }
            }

        return getNum;
    }
}
