package com.msb.pisa;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/25 - 10 - 25 - 14:55
 * @Description: com.msb.pisa
 * @version: 1.0
 */
public class MeatPizza extends Pizza{


    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public MeatPizza(int weight) {
        this.weight = weight;
    }

    public MeatPizza(String name, Integer size, Double price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    @Override
    public String showPizza() {
        return super.showPizza()+"\n培根的克数是："+weight+"克";
    }
}
