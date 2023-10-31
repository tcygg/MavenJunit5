package com.msb.io.ygg01;

import java.io.File;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/7 - 10 - 07 - 15:50
 * @Description: com.msb.io.ygg01
 * @version: 1.0
 */
public class ceshi02 {
    public static void main(String[] args) {


        File f = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io");


        String[] list = f.list();
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);

        }


    }
}
