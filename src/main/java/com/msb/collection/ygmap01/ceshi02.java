package com.msb.collection.ygmap01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/7 - 10 - 07 - 11:09
 * @Description: com.msb.collection.ygmap01
 * @version: 1.0
 */
public class ceshi02 {
    public static void main(String[] args) {

        Map<Integer, Integer> ceshimap001 = new HashMap<>();


        ceshimap001.put(3,12);
        ceshimap001.put(13,112);
        ceshimap001.put(3,112);
        ceshimap001.put(311,122);

        System.out.println(ceshimap001);

        System.out.println(ceshimap001.size());

        System.out.println(ceshimap001.get(311));


        System.out.println(ceshimap001.keySet());

        for (Integer integer : ceshimap001.keySet()) {
            System.out.println(integer);

        }
        System.out.println(ceshimap001.values());

        Set<Map.Entry<Integer, Integer>> ceshi1 = ceshimap001.entrySet();

        System.out.println(ceshi1.toString());


    }
}
