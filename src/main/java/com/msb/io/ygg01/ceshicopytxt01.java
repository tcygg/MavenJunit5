package com.msb.io.ygg01;

import java.io.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/7 - 10 - 07 - 19:26
 * @Description: com.msb.io.ygg01
 * @version: 1.0
 */
public class ceshicopytxt01 {
    public static void main(String[] args) throws IOException {


        File f1 = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/ygg01/demo02.txt");
        //2.有一个目标文件：
        File f2 = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/ygg01/demo88.txt");
        //3.搞一个输入的管 怼到源文件上：
        FileReader fr = new FileReader(f1);
        //4.搞一个输出的管，怼到目标文件上：
        FileWriter fw = new FileWriter(f2);
        int n = fr.read();
        while(n!=-1){
            fw.write(n);
            n = fr.read();
        }

        fw.close();
        fr.close();

    }
}
