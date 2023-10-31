package com.msb.collection.yg1;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 10:08
 * @Description: com.msb.collection.yg1
 * @version: 1.0
 */
public class MyLinkedList {
    Node first;
    //链中一定有一个尾节点：
    Node last;
    //计数器：
    int count = 0;
    //提供一个构造器：
    public MyLinkedList(){
    }

    //添加元素方法：
    public void add(Object o){
        if(first == null){//证明你添加的元素是第一个节点：
            //将添加的元素封装为一个Node对象：
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            //当前链中第一个节点变为n
            first = n;
            //当前链中最后一个节点变为n
            last = n;
        }else{//证明已经不是链中第一个节点了
            //将添加的元素封装为一个Node对象：
            Node n = new Node();
            n.setPre(last);//n的上一个节点一定是当前链中的最后一个节点last
            n.setObj(o);
            n.setNext(null);
            //当前链中的最后一个节点的下一个元素 要指向n
            last.setNext(n);
            //将最后一个节点变为n
            last = n;
        }
        //链中元素数量加1
        count++;
    }

}
/*class Test {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建一个MyLinkedList集合对象：
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
//        System.out.println(ml.getSize());
//        System.out.println(ml.get(0));
    }
}*/
