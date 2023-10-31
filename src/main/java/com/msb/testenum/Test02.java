package com.msb.testenum;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 21:20
 * @Description: com.msb.testenum
 * @version: 1.0
 */
public class Test02 {

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(19);
        p.setName("lili");
//        p.setSex(Gender.男);//传入枚举类Gender的对象：-->在入口处对参数进行了限制
        System.out.println(p);
    }
}
