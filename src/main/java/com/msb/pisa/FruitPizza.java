package com.msb.pisa;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/25 - 10 - 25 - 15:12
 * @Description: com.msb.pisa
 * @version: 1.0
 */
public class FruitPizza extends Pizza{
    private String burdening;
    public String getBurdening() {
        return burdening;
    }
    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }
    //构造器：
    public FruitPizza() {
    }
    public FruitPizza(String name, int size, Double price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;
    }
    //重写父类showPizza方法：
    @Override
    public String showPizza() {
        return super.showPizza()+"\n你要加入的水果："+burdening;
    }
}
