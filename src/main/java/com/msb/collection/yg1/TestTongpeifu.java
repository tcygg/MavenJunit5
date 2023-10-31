package com.msb.collection.yg1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 06:42
 * @Description: com.msb.collection.yg1
 * @version: 1.0
 */
public class TestTongpeifu {
//    public void ceshi(List<?> list){
//        System.out.println(list.toString());
//    }
 /*   public void ceshi(List<String> list){
        System.out.println(list.toString());
    }*/
 public void a(List<?> list){
     //内部遍历的时候用Object即可，不用？
     for(Object a:list){
         System.out.println(a);
     }
     Object s = list.get(0);
     System.out.println(s.getClass());
 }
}
class test001{
    public static void main(String[] args) {
        TestTongpeifu aa =new TestTongpeifu();
        List<String> list2 =new ArrayList<>();
        list2.add("13");
        list2.add("113");
        list2.add("123");
        list2.add("13332");

        System.out.println(list2);
        aa.a(list2);
    }
}