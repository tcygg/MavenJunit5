package com.ceshiren.xuexi01;

/**
 * @Auther: ygg
 * @Date: 2023/3/14 - 03 - 14 - 1:30
 * @Description: com.ceshiren.xuexi01
 * @version: 1.0
 */
import java.util.HashMap;


import com.fasterxml.jackson.databind.util.JSONPObject;


public class HashMapJson01 {

    /**
     * @param args
     */

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        Person p = new Person();
        p.setAge("22");
        p.setName("chage");

        map.put("国籍", "中国");
        map.put("爱好", "吃饭");
        map.put("obj", p);//和产生下面的数据结构是一样的

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("部门", "研发");
        map2.put("地址", "深圳");
        map.put("message",map2);


        JSONPObject jsonObj = new JSONPObject(map);//转化为json格式
        System.out.println("全部信息="+jsonObj.toString());//打印json串

        System.out.println("======第一种输出方式======");
   /**     System.out.println("获取里面的obj="+jsonObj.getValue("obj"));
        System.out.println("获取里面的obj某个成员信息="+jsonObj.getJSONObject("obj").getString("age"));
        System.out.println("获取里面的map2="+jsonObj.getJSONObject("message"));
        System.out.println("获取里面的map2某个成员信息="+jsonObj.getJSONObject("message").getString("部门"));


        System.out.println("======第二种输出方式======");
        try {
            JSONObject jsonObjOutput = new JSONObject(jsonObj.toString());//和第一种基本用法一样
            System.out.println("获取里面的obj="+jsonObjOutput.getJSONObject("obj"));
            System.out.println("获取里面的obj某个成员信息="+jsonObjOutput.getJSONObject("obj").getString("age"));
            System.out.println("获取里面的map2="+jsonObjOutput.getJSONObject("message"));
            System.out.println("获取里面的map2某个成员信息="+jsonObjOutput.getJSONObject("message").getString("部门"));
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

**/
    }

}