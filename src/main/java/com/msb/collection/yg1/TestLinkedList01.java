package com.msb.collection.yg1;

import java.util.LinkedList;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 09:10
 * @Description: com.msb.collection.yg1
 * @version: 1.0
 */
public class TestLinkedList01 {
    public static void main(String[] args) {
//        List<?> list1 = new LinkedList<>();

        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("bbbbb");
        list.add("fffff");
        list.addFirst("jj");
        list.addLast("hh");
        list.offer("kk");//添加元素在尾端
        list.offerFirst("pp");
        list.offerLast("rr");
        System.out.println(list);//LinkedList可以添加重复数据
        System.out.println(list.poll());//删除头上的元素并且将元素输出
        System.out.println(list);//LinkedList可以添加重复数据

//        System.out.println(list.pollFirst());
//        System.out.println(list.pollLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);//LinkedList可以添加重复数据
     /*   list.clear();
        System.out.println(list.pollFirst());
        System.out.println(list.removeFirst());
        System.out.println(list);*/
        System.out.println(list.get(1));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }
        for(Object obj:list){
            System.out.println(obj);
        }



    }
}
