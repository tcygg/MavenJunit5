package com.msb.testenum;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/18 - 10 - 18 - 21:10
 * @Description: com.msb.testenum
 * @version: 1.0
 */
public enum Season implements TestInterface{
    SPRING{
        @Override
        public void show() {
            System.out.println("这是春天。。。");


        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是夏天。。");
        }},
    AUTUMN{
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };


   /* @Override
    public void show() {
        System.out.println("这是Season....");

    }*/
}