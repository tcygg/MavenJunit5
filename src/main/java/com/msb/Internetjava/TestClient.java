package com.msb.Internetjava;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: TcYgg
 * @Date: 2023/10/17 - 10 - 17 - 11:07
 * @Description: com.msb.Internetjava
 * @version: 1.0
 */
public class TestClient {


    public static void main(String[] args) throws IOException {

        Socket s = new Socket("10.220.32.189",8888);

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        //利用这个OutputStream就可以向外发送数据了，但是没有直接发送String的方法
        //所以我们又在OutputStream外面套了一个处理流：DataOutputStream
        dos.writeUTF("你好");


        //接收服务器端的回话--》利用输入流：
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readUTF();
        System.out.println("服务器端对我说："+str);



        dis.close();
        is.close();

        //3.关闭流  +  关闭网络资源：
        dos.close();
        os.close();
        s.close();





    }
}
