package com.xiaoyao.wangLuoBianCheng;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author xiaoyao
 * 服务端
 * @create 2022-11-17 22:55
 */
public class Server {

    public static void main(String[] args) throws IOException {

        String[] strings = {"a","b"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }


        System.out.println(strings[1]);


        System.out.println(strings.toString());

        int[] as = {1,2,3};
        System.out.println(as[0]);


       /* //指定服务端的端口号
        ServerSocket serverSocket = new ServerSocket(123456);
        //创建一个对象用来接收客户单发送的请求
        Socket accept = serverSocket.accept();
        //创建流，使用流来接受客户端发送过来的数据--字节输入流
        InputStream inputStream = accept.getInputStream();
        //指定流的单位接收大小
        byte[] bytes = new byte[1024];*/


    }

}
