package com.xiaoyao.wangLuoBianCheng.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiaoyao
 * 服务端
 * @create 2022-11-17 22:55
 */
public class Server {

    public static void main(String[] args) throws IOException {
        // 1.创建SocketServer对象,指定端口号
        // 2.调用accept方法,等待请求,建立连接
        // 3.通过建立连接返回的socket对象获得输入流
        // 4.读取数据
        //         会写数据给客户端
        // 5.通过Socket获得输出流对象outputStream
        // 6.写出数据
        // 7.关闭流,释放资源

        //指定服务端的端口号
        ServerSocket serverSocket = new ServerSocket(12345);
        //创建一个对象用来接收客户单发送的请求
        Socket accept = serverSocket.accept();
        //创建流，使用流来接受客户端发送过来的数据--字节输入流
        InputStream inputStream = accept.getInputStream();
        //指定流的单位接收大小
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //创建输出流--用来返回数据
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("好啊，我也想去".getBytes());

        //关闭流
        outputStream.close();
        inputStream.close();
        //serverSocket.close();


    }

}
