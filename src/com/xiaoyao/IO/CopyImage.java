package com.xiaoyao.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xiaoyao
 * @create 2022-11-18 23:58
 */
public class CopyImage {
    public static void main(String[] args) throws IOException {
        // 1.字节输入流
        FileInputStream fileInputStream = new FileInputStream("source/com/xiaoyao/Io/a.png");
        // 2.字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream("source/com/xiaoyao/Io/a_copy.png",false);
        // 3.定义传输效率
        int len;
        byte[] bytes = new byte[1024];
        // 4.传输图片
        while((len = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes,0,len);
        }
        // 5.关闭流
        fileInputStream.close();
        fileOutputStream.close();

    }
}
