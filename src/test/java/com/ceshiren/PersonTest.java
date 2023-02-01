package com.ceshiren;

import com.ceshiren.lianxi.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: zhaoss
 * @Date: 2022/11/20 - 11 - 20 - 15:41
 * @Description: com.ceshiren
 * @version: 1.0
 */
class PersonTest {
    //前置条件
    @BeforeEach
    void setUp(){
        System.out.println("执行之前需要的步骤");
    }

    @AfterEach
    void setDown(){
        System.out.println("执行之后需要的步骤");
    }

    @Test
    @DisplayName("第一条用例")
    void add() {
        System.out.println("第一条用例");
        Person xusong=new Person(34,55);
        assertEquals(xusong.add(13,26),39);

    }

    @Test
    @DisplayName("第二条用例")
    void testToString() {
        System.out.println("第二条用例");
        //assertEquals(2,1+1);
        assertTrue(3>1);
        assertAll("All",
                () -> assertEquals(2,3),
                () -> assertEquals(2,7),
                () -> assertEquals(2,2)
                );

    }
}