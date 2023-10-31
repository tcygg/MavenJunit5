package com.msb.testenum;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 19:08
 * @Description: com.msb.testenum
 * @version: 1.0
 */
public enum FamilyEnum {
    FATHER(1,"baba"),
    MOTHER(2,"mama"),
    SON(3,"son"),
    DAUGHTER(4,"daughter");


    private Integer code;
    private String miaoshu;


    FamilyEnum(Integer code, String miaoshu) {
        this.code = code;
        this.miaoshu = miaoshu;
    }

    @Override
    public String toString() {
        return "FamilyEnum{" +
                "code=" + code +
                ", miaoshu='" + miaoshu + '\'' +
                '}';
    }
}
