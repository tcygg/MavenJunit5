package com.msb.testenum;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 18:42
 * @Description: com.msb.testenum
 * @version: 1.0
 */
public class Season1 {

    private final String seasonName ;//季节名字
    private final String seasonDesc ;//季节描述
    //利用构造器对属性进行赋值操作：

    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供枚举类的有限的  确定的对象：
    public static final Season1 SPRING = new Season1("春天","春暖花开");
    public static final Season1 SUMMER = new Season1("夏天","烈日炎炎");
    public static final Season1 AUTUMN = new Season1("秋天","硕果累累");
    public static final Season1 WINTER = new Season1("冬天","冰天雪地");


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
