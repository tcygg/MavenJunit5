package com.msb.io;

import com.msb.oop.test1.xx2.ceshi01;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.net.URL;
import java.util.HashMap;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/30 - 08 - 30 - 21:27
 * @Description: com.msb.io
 * @version: 1.0
 */
public class Yaml01 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap();
        try {
            Yaml yaml = new Yaml();
            //通过class.getResource来获取yaml的路径
            URL resource = ceshi01.class.getResource("ceshi01.yaml");
            if (resource != null) {
                //读取yaml中的数据并且以map集合的形式存储
                map = yaml.load(new FileInputStream(resource.getFile()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //分别获取对应的值
//        int num = (int) map.get("num");
//        String printClsName = (String) map.get("printClsName");
        String nineClsName = (String) map.get("nineClsName");

        System.out.println(nineClsName);
    }
}

