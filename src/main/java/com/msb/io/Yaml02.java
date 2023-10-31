package com.msb.io;

import org.yaml.snakeyaml.Yaml;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: TcYgg
 * @Date: 2023/8/31 - 08 - 31 - 09:21
 * @Description: com.msb.io
 * @version: 1.0
 */
public class Yaml02 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 使用流关联yml配置文件
        BufferedReader br = new BufferedReader(new FileReader(com.msb.io.Yaml02.class.getClassLoader().getResource("ceshi02.yaml").getPath()));

        // 2. 创建yaml工具类
        Yaml yaml = new Yaml();

        // 3. 使用yaml工具类加载 流
        // 返回的字符形式非常类似于JSON, 但又不是JSON, 因为返回的字符之间使用的是 = 号连接的
        // 可以直接转换为Map 进行处理, key 的类型是 字符串, value的类型为Object
        Map<String, Object> objectMap = (Map<String, Object>) yaml.load(br);

        // 4. 以下就是获取yaml文件中的内容, 可以通过遍历map的方式获取, 也可以按照kv的形式获取

        // 获取所有的key
        Set<String> keySet = objectMap.keySet();
        // 通过 key 获取value
        for (String key : keySet) {
            System.out.println(key + "\t : " + objectMap.get(key).toString());
        }

        // 获取单值
        Object name = objectMap.get("name");
        System.out.println(name);

        // 获取数组类型
        ArrayList<String> teamMember = (ArrayList<String>) objectMap.get("teamMember");
        for (String member : teamMember) {
            System.out.println(member);
        }

        // 获取复合对象 , 注意类型为 LinkedHashMap
        LinkedHashMap<String, ArrayList<String>> hobbies = (LinkedHashMap<String, ArrayList<String>>) objectMap.get("hobbies");
        for (Map.Entry<String, ArrayList<String>> listEntry : hobbies.entrySet()) {
            System.out.println(listEntry.getKey() + " : " + listEntry.getValue());
        }
    }

}
