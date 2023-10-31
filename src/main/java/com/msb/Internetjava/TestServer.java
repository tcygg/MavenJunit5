package com.msb.Internetjava;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/17 - 10 - 17 - 11:13
 * @Description: com.msb.Internetjava
 * @version: 1.0
 */
public class TestServer {

    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //1.创建套接字： 指定服务器的端口号
        ServerSocket ss = new ServerSocket(8888);
        //2.等着客户端发来的信息：
        Socket s = ss.accept();//阻塞方法:等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行。
        //accept()返回值为一个Socket，这个Socket其实就是客户端的Socket
        //接到这个Socket以后，客户端和服务器才真正产生了连接，才真正可以通信了
        //3.感受到的操作流：
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        //4.读取客户端发来的数据：
        String str = dis.readUTF();
        System.out.println("客户端发来的数据为："+str);

        //向客户端输出一句话：---》操作流---》输出流
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("你好，我是服务器端，我接受到你的请求了");

        //5.关闭流+关闭网络资源：
        //关闭服务器的输出流
        dos.close();
        os.close();
        //关闭服务器的输入流(接入数据)

        dis.close();
        is.close();
        s.close();
        ss.close();
    }
}
