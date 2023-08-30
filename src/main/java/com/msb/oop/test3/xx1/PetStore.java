package com.msb.oop.test3.xx1;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/29 - 08 - 29 - 09:33
 * @Description: com.msb.oop.test3.xx1
 * @version: 1.0
 */
public class PetStore {
    //方法：提供动物
    public static Animals getAnimal(String petName){//多态的应用场合（二）
        Animals an = null;
       /* if("猫".equals(petName)){//petName.equals("猫") --》这样写容易发生空指针异常
            an = new Cat();
        }
        if("狗".equals(petName)){
            an = new Dog();
        }
        if("猪".equals(petName)){
            an = new Pig();
        }*/
        switch (petName){
            case "猫" :{
                an = new Cat();
                break;
            }
            case "猪" :{
                an = new Pig();
                break;
            }
            case "狗" :{
                an = new Dog();
                break;
            }
        }

        return an;
    }
}
