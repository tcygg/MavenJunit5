package com.msb.collection.yg1;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/20 - 09 - 20 - 10:05
 * @Description: com.msb.collection.yg1
 * @version: 1.0
 */
public class Node {
    private Node pre;
    private Object obj;
    private Node next;

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "TestNode{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
