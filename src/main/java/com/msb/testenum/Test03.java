package com.msb.testenum;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 21:27
 * @Description: com.msb.testenum
 * @version: 1.0
 */
public class Test03 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        Gender sex = Gender.男;
        //switch后面的（）中可以传入枚举类型
        //switch后面的（）:int,short,byte,char,String ,枚举
        switch (sex){
            case 女:
                System.out.println("是个女孩");
                break;
            case 男:
                System.out.println("是个男孩");
                break;
        }
    }
}
