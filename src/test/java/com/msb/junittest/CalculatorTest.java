package com.msb.junittest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 17:38
 * @Description: com.msb.junittest
 * @version: 1.0
 */
class CalculatorTest {
    @Before
    public void init(){
        System.out.println("方法执行开始了。。。");
    }
    @After
    public void close(){
        System.out.println("方法执行结束了。。。");
    }

    @Test
    public void add() {
        System.out.println("测试add方法");
        Calculator cal = new Calculator();
        int result = cal.add(110, 30);
        System.out.println(result);
        Assert.assertEquals(40,result);//第一个参数：预测结果  第二个参数：实际结果
    }

    @Test
    public void sub() {
        System.out.println("测试sub方法");
        Calculator cal = new Calculator();
        int result = cal.sub(10, 30);
        System.out.println(result);
    }
}