package com.msb.io.ygg02;

import java.io.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/8 - 10 - 08 - 18:51
 * @Description: com.msb.io.ygg02
 * @version: 1.0
 */
public class zifuliu01 {
    public static void main(String[] args) throws IOException {


        InputStream in = System.in;

        InputStreamReader isr = new InputStreamReader(in);

        BufferedReader br = new BufferedReader(isr);

        File f = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/IOFILE12.txt");

        FileWriter fw = new FileWriter(f);

        BufferedWriter bw = new BufferedWriter(fw);



    }
}
