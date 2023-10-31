package com.msb.pisa;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/25 - 10 - 25 - 14:46
 * @Description: com.msb.pisa
 * @version: 1.0
 */
public class Pizza {
    private String name;
    private Integer size;
    private Double price;

    public Pizza() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String showPizza() {
        return
                "匹萨的名字是:" + name +"\n"+
                "匹萨的大小是:" + size +"寸" +"\n"+
                "匹萨的价格是:" + price +'元';

    }
    /*public String showPizza(){
        return "匹萨的名字是："+name+"\n匹萨的大小是："+size+"寸\n匹萨的价格："+price+"元";
    }*/

    public Pizza(String name, Integer size, Double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
