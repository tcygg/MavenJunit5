package com.msb.oop.fengzhuang.xx6;

import java.util.Objects;

/**
 * @Auther: ygg
 * @Date: 2022/6/8 - 06 - 08 - 18:18
 * @Description: com.msb.test8
 * @version: 1.0
 */
public class Phone {
    private String brand;
    private int year;
  private Double price;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public Phone() {
    }



    public boolean equals11(Object obj) {
        Phone other = (Phone) obj;
        if (//this.getBrand()==other.getBrand() &&
            // this.getPrice()==other.getPrice()
            // && this.getYear()==other.getYear()
                this.getPrice()==other.getPrice()
        ) {
            return true;
        }
        {
            return false;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return year == phone.year && Objects.equals(brand, phone.brand) && Objects.equals(price, phone.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, year, price);
    }
    //对equals方法进行重写：
   /* public double equals2(Object obj) {//Object obj = new Phone();
        //将obj转为Phone类型：
        Phone other = (Phone) obj;//向下转型，为了获取子类中特有的内容
        System.out.println(other.getPrice1());

    }*/
}