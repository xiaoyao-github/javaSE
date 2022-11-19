package com.xiaoyao.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xiaoyao
 * 字符输入流使用案例
 * @create 2022-11-19 0:11
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        //文件内容：肖瑶 韩彩屏
        File file = new File("source/com/xiaoyao/Io/d.txt");
        FileReader reader = new FileReader(file);

        int read;
        while ((read = reader.read()) != -1){
            System.out.println((char) read);
        }

        //关闭流
        reader.close();
    }
}
