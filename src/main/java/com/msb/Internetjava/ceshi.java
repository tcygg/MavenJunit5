package com.msb.Internetjava;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/16 - 10 - 16 - 16:46
 * @Description: com.msb.Internetjava
 * @version: 1.0
 */
public class ceshi {


    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("10.220.32.189");

        System.out.println(ia);

        InetAddress ia2 = InetAddress.getByName("localhost");//localhost指代的是本机的ip地址
        System.out.println(ia2);

        InetAddress ia3 = InetAddress.getByName("127.0.0.1");//127.0.0.1指代的是本机的ip地址
        System.out.println(ia3);
        InetAddress ia4 = InetAddress.getByName("zhangxindeMacBook-Pro-8.local");//封装计算机名
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("www.mashibing.com");//封装域名
        System.out.println(ia5);

        System.out.println(ia5.getHostName());//获取域名
        System.out.println(ia5.getHostAddress());//获取ip地址


    }
}
