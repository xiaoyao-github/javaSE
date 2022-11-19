package com.xiaoyao.wangLuoBianCheng.demo2;

import java.io.*;
import java.net.Socket;

/**
 * @author xiaoyao
 *
 * 网络编程--客户端 发送一张图片
 * @create 2022-11-19 15:31
 */
public class ClientImage {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

        File file = new File("source/com/xiaoyao/Io/Image.png");
        FileInputStream inputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = new byte[1024*8];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }

        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();

    }
}
