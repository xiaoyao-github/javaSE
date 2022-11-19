package com.xiaoyao.wangLuoBianCheng.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiaoyao
 * @create 2022-11-19 17:03
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8000);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes,0,len));//输出的是下面第二张图
        socket.close();
        server.close();
    }
}
