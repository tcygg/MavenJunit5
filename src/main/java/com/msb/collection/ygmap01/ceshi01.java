package com.msb.collection.ygmap01;

import java.util.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/28 - 09 - 28 - 11:07
 * @Description: com.msb.collection.ygmap01
 * @version: 1.0
 */
public class ceshi01 {
    public static void main(String[] args) {


        Map<String, Integer> ygmap = new HashMap() {
        };
        ygmap.put("zhangsan", 55);

        ygmap.put("lisi", 154);

        System.out.println(ygmap);
        System.out.println(ygmap.size());

        System.out.println(ygmap.get("lisi"));

        System.out.println(ygmap.keySet());

        Set<String> aa = ygmap.keySet();


       /* System.out.println(aa);
        System.out.println(aa.getClass());
        for(String a:aa){
            System.out.println(a);
        }*/
        System.out.println("------------");
        Collection<Integer> aa1 = ygmap.values();

        for (Integer value : ygmap.values()) {
            System.out.println(value);

        }

        Collection<Integer> values = ygmap.values();
        Set<String> strings = ygmap.keySet();


        for (Integer value : values) {
            System.out.println(value);

        }


        System.out.println(aa1);
        for(Integer a:aa1){
            System.out.println(a);
        }

        Set<Map.Entry<String, Integer>> entries = ygmap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey()+"----"+entry.getValue());

        }


    }
}
