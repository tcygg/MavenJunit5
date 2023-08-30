package com.msb.oop.fengzhuang.xx11;

import com.msb.oop.fengzhuang.xx10.Mom;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/25 - 08 - 25 - 18:30
 * @Description: com.msb.oop.fengzhuang.xx11
 * @version: 1.0
 */
public class Girl {
    //属性：
    String name;
    double weight;
    Mom m /*= new Mom()*/;
    //方法：
    public void add(int a){//参数是基本数据类型
        System.out.println(a);
        System.out.println(a+100);
    }
    //谈恋爱的方法：
    public void love(Boy b){//参数是引用数据类型Boy
        System.out.println("我男朋友的名字是："+b.name+"，我男朋友的年龄是："+b.age);
        b.buy();
    }
    //女孩跟妈妈聊天：
    public void wechat(){
        m.say();
    }
    //构造器：
    public Girl(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
}
