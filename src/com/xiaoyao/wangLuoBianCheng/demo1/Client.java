package com.xiaoyao.wangLuoBianCheng.demo1;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author xiaoyao
 * 网络编程--客户端
 *
 * @create 2022-11-17 22:55
 */
public class Client {
    public static void main(String[] args) throws IOException {


        // 1.创建Socket对象,指定服务器的ip地址和端口号
        // 2.通过Socket对象获得输出流对象
        // 3.使用输出流写出数据
        // 4.使用socket对象获得输入流对象
        // 5.使用输入流读取数据
        // 4.关闭流释放资源
        //创建客户端对象，同时指定ip和端口号
        Socket socket = new Socket("127.0.0.1", 12345);
        //向服务端发送请求，使用字节输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("彩屏，我想请你看电影".getBytes());
        //创建输入流，获取返回的数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

        //关闭流
        inputStream.close();
        outputStream.close();
        socket.close();

    }

}
