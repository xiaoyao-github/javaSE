package com.xiaoyao.wangLuoBianCheng.demo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xiaoyao
 * 网络编程--服务端接收图片
 * 开启线程可以接收多张图片
 * @create 2022-11-19 16:04
 */
public class ServerImage2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);

        //多线程接收图片
        while(true){
            Socket accept = serverSocket.accept();

            new Thread(()->{
                try {
                    //创建缓冲字节输入流
                    InputStream inputStream = accept.getInputStream();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

                    byte[] bytes = new byte[1024*8];
                    int len;

                    //将接收的文件重新保存
                    String imgName = String.valueOf(System.currentTimeMillis());
                    System.out.println("保存的图片名："+imgName);
                    File file = new File("source/com/xiaoyao/Io/"+imgName+".png");
                    FileOutputStream outputStream = new FileOutputStream(file,false);

                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                    while((len = bufferedInputStream.read(bytes)) != -1){
                        bufferedOutputStream.write(bytes,0,len);
                    }


                    //关闭流
                    bufferedOutputStream.close();
                    bufferedInputStream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }).start();
        }
    }
}
