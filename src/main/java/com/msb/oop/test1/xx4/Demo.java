package com.msb3;

/**
 * @Auther: ygg
 * @Date: 2022/6/2 - 06 - 02 - 18:09
 * @Description: com.msb3
 * @version: 1.0
 */
public class Demo {
    //属性
    int a;
    static int sa;
    //方法
    public void a(){
        System.out.println("-----a");
        {
            //普通块限制了局部变量的作用范围
            System.out.println("这是普通块");
            System.out.println("----000000");
            int num = 10;
            System.out.println(num);
        }
        //System.out.println(num);
        //if(){}
        //while(){}
    }
    public static void b(){
        System.out.println("------b");
    }
    //构造块
    {
        System.out.println("------这是构造块");
    }
    //静态块
    static{
        System.out.println("-----这是静态块");
        //在静态块中只能方法：静态属性，静态方法
        System.out.println(sa);
        b();
    }
    //构造器
    public Demo(){
        System.out.println("这是空构造器");
    }
    public Demo(int a){
        this.a = a;
    }
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Demo t = new Demo();
        t.a();
        Demo t2 = new Demo();
       // t2.a();
    }

}
