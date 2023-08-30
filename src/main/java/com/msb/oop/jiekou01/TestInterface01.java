package com.msb.oop.jiekou01;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/30 - 08 - 30 - 11:17
 * @Description: com.msb.oop.jiekou01
 * @version: 1.0
 */
public interface TestInterface01 {
    //常量：
    /*public static final*/ int NUM = 10;
    //抽象方法：
    /*public abstract */ void a();
    /*public abstract*/ void b(int num);
    /*public abstract*/ int c(String name);
}

class student implements TestInterface01{

    @Override
    public void a() {

    }

    @Override
    public void b(int num) {

    }

    @Override
    public int c(String name) {
        return 0;
    }
}