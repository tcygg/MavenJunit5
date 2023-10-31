package com.msb.oop.commonclass;

/**
 * @Auther: TcYgg
 * @Date: 2023/9/5 - 09 - 05 - 14:39
 * @Description: com.msb.oop.commonclass
 * @version: 1.0
 */
public class ceshi10001 {
    public static void main(String[] args) {
//        int a = 1;
//        String rr = "dd";
//        isBaseType(a);
        Double rr = 0.56;
        isBaseType(rr);

//        double b = 0.01;
//        isBaseType(b);
//        long c = 12L;
//        isBaseType(c);
//        Integer aa = 1;
//        isBaseType(aa);
//        Double bb = 0.01;
//        isBaseType(bb);
//        Long cc = 11L;
//        isBaseType(cc);


    }

    public static boolean isBaseType(Object object) {
        Class className = object.getClass();
        if (object instanceof Integer) {
            System.out.println(object + " is int or Integer" );
            System.out.println("----------------" );
        }

        if (object instanceof Double) {
            System.out.println(object + " is double or Double" );
            System.out.println("----------------" );
        }

        if (object instanceof Long) {
            System.out.println(object + " is long or Long" );
            System.out.println("----------------" );
        }
        return false;
    }
}
