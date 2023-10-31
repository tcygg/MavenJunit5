package com.msb.io.ygg01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/7 - 10 - 07 - 16:55
 * @Description: com.msb.io.ygg01
 * @version: 1.0
 */
public class ceshi03 {
    public static void main(String[] args) throws IOException {



        File f = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/IOFILE01.txt");

        FileReader fr = new FileReader(f);
        int n = fr.read();

        char[] ch = new char[5];//缓冲数组

        int read = fr.read(ch);

//        int n1 = fr.read();
//        int n2 = fr.read();
//        int n3 = fr.read();
//        int n4 = fr.read();
//        int n5 = fr.read();
//        int n6 = fr.read();

       /* System.out.println(n);
        System.out.println(n1);

        System.out.println(n2);

        System.out.println(n3);

        System.out.println(n4);
        System.out.println(n5);
*/

        /*while(n!=-1){
            System.out.println(n);
            n = fr.read();
        }*/
        int n1;
        while((n1 = fr.read())!=-1){
            System.out.println((char)n1);
        }


        fr.close();


    }
}
