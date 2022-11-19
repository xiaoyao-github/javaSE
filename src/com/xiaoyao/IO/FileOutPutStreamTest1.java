package com.xiaoyao.IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author xiaoyao
 * 往指定文件中写入字符串
 *
 * @create 2022-11-17 23:13
 */
public class FileOutPutStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件对象
        File file = new File("source/com/xiaoyao/Io/a.txt");
        // 2.创建流
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        // 3.将要写入的字符串转换为字节数组
        String writeStr = "彩屏，周末有空吗，想请看个电影。";
        //String writeStr = "caiping,zhoumoyoukongma?xiangyueniqukangedianying";
        byte[] bytes = writeStr.getBytes("gbk");

        // 4.写到文件中去
        fileOutputStream.write(bytes);
        // 4.1指定写入到文件文件中的字节长度
        //fileOutputStream.write(bytes,4,4);
        fileOutputStream.write("\r".getBytes());
        // 5.关闭流
        fileOutputStream.close();

    }
}
