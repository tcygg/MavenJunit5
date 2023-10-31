package com.msb.io.ygg01;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/7 - 10 - 07 - 15:26
 * @Description: com.msb.io.ygg01
 * @version: 1.0
 */
public class ceshi01 {


    public static void main(String[] args) throws IOException {


        File f1 = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/IOFILE01.txt");

        File f2 = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/IOFILE01.txt");

        File f = new File("./IOFILE01.txt");


        File f11 = new File("/Users/yanggao/IT/IDEA/IDEA_workspace_hogwarts/MavenJunit5/src/main/java/com/msb/io/IOFILE02.txt");


        System.out.println("文件是否可读：" + f1.canRead());


        System.out.println("文件是否可写：" + f1.canWrite());

        System.out.println("上级目录：" + f.getParent());
        System.out.println("是否是一个目录：" + f2.isDirectory());
        System.out.println("是否是一个文件：" + f.isFile());
        System.out.println("是否隐藏：" + f.isHidden());


        System.out.println("文件的大小：" + f.length());
        System.out.println("文件的名字：" + f.getName());

        System.out.println("是否存在：" + f.exists());

     /*   if (f11.exists()) {//如果文件存在，将文件删除操作
            f11.delete();
        } else {//如果不存在，就创建这个文件
            f11.createNewFile();
        }*/

        System.out.println(f2 == f1);//比较两个对象的地址
        System.out.println(f2.equals(f1));//比较两个对象对应的文件的路径

        //跟路径相关的：
        System.out.println("绝对路径："+f.getAbsolutePath());
        System.out.println("相对路径："+f.getPath());
        System.out.println("toString:"+f.toString());





    }

}
