package com.msb.oop.test3.xx1;

import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/26 - 08 - 26 - 20:27
 * @Description: com.msb.oop.test3.xx1
 * @version: 1.0
 */
public class ceshi22 {
    public static void main(String[] args) {


//        Cat ccc = new Cat();
//        Dog dd = new Dog();

//        ccc.shout();
//        Girls gg =new Girls();

        Girls2 gg2 = new Girls2();
        String aa1;
        Scanner sc =new Scanner(System.in);
        aa1 =sc.next();

        Animals an =PetStore.getAnimal(aa1);
        gg2.play(an);

/*        an.shout();
        System.out.println(an.name);
        //转型：向下转型
//        Dog da = (Dog)an;
//
//        System.out.println(da.age);
        Dog dd = new Dog();
        System.out.println(dd.age);*/



    }
}
