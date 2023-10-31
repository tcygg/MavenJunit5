package com.msb.pisa;

import java.util.Scanner;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/20 - 10 - 20 - 07:39
 * @Description: com.msb.pisa
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
            //选择购买匹萨：
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择你想要购买的匹萨（1.培根匹萨 2.水果匹萨）:");
            int choice = sc.nextInt();//选择
            //通过工厂获取匹萨：
            Pizza pizza = PizzaStore.getPizza(choice);
            System.out.println(pizza.showPizza());
        }



    }
