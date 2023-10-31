package com.msb.pisa;

import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/25 - 10 - 25 - 15:14
 * @Description: com.msb.pisa
 * @version: 1.0
 */
public class PizzaStore {

    public static Pizza getPizza(int choice){
        Scanner sc = new Scanner(System.in);
        Pizza p = null;
        switch (choice){
            case 1:
            {
                System.out.println("请录入培根的克数：");
                int weight = sc.nextInt();
                System.out.println("请录入匹萨的大小：");
                int size = sc.nextInt();
                System.out.println("请录入匹萨的价格：");
                Double price = sc.nextDouble();
                //将录入的信息封装为培根匹萨的对象：
                MeatPizza bp = new MeatPizza("培根匹萨",size,price,weight);
                p = bp;
            }
            break;
            case 2:
            {
                System.out.println("请录入你想要加入的水果：");
                String burdening = sc.next();
                System.out.println("请录入匹萨的大小：");
                int size = sc.nextInt();
                System.out.println("请录入匹萨的价格：");
                Double price = sc.nextDouble();
                //将录入的信息封装为水果匹萨的对象：
                FruitPizza fp = new FruitPizza("水果匹萨",size,price,burdening);
                p = fp;
            }
            break;
        }
        return p;
    }
}
