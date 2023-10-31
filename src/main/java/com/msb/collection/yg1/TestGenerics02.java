package com.msb.collection.yg1;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/19 - 09 - 19 - 20:31
 * @Description: com.msb.collection.yg1
 * @version: 1.0
 */
public class TestGenerics02 <E>{
    int age;
    String name;
    E sex;
    public void a(E n){
    }
    public void b(E[] m){
    }

    public TestGenerics02() {
    }

    public TestGenerics02(int age, String name, E sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
}

class Test{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //GenericTest进行实例化：
        //(1)实例化的时候不指定泛型：如果实例化的时候不明确的指定类的泛型，那么认为此泛型为Object类型
        TestGenerics02 gt1 = new TestGenerics02();
        gt1.a("abc");
        gt1.a(17);
        gt1.a(9.8);
        gt1.b(new String[]{"a","b","c"});
        //（2）实例化的时候指定泛型：---》推荐方式
        TestGenerics02<String> gt2 = new TestGenerics02<>();
        gt2.sex = "男";
        gt2.a("abc");
        gt2.b(new String[]{"a","b","c"});

    }
}