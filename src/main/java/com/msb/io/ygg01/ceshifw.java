package com.msb.io.ygg01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/7 - 10 - 07 - 19:05
 * @Description: com.msb.io.ygg01
 * @version: 1.0
 */
public class ceshifw {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/ygg01/demo02.txt");
        //2.FileWriter管怼到文件上去：
        FileWriter fw = new FileWriter(f,true);
        //3.开始动作：输出动作：
        //一个字符一个字符的往外输出：
        String str = "fdfhello你好111";
        for (int i = 0 ;i < str.length();i++){
            fw.write(str.charAt(i));
        }
        //4.关闭流：
        fw.close();

    }
}
