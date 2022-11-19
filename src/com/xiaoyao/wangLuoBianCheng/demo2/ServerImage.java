package com.xiaoyao.wangLuoBianCheng.demo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiaoyao
 * 网络编程-客户单接收图片
 * @create 2022-11-19 15:22
 */
public class ServerImage {
    public static void main(String[] args) throws IOException {
        //创建服务端指定端口
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket accept = serverSocket.accept();
        //创建缓冲字节输入流
        InputStream inputStream = accept.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        byte[] bytes = new byte[1024*8];
        int len;

        //将接收的文件重新保存
        File file = new File("source/com/xiaoyao/Io/Image_copy.png");
        FileOutputStream outputStream = new FileOutputStream(file,false);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        while((len = bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }

        //关闭流
        bufferedOutputStream.close();
        bufferedInputStream.close();


    }
}
