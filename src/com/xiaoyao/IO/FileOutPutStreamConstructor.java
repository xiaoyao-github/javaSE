package com.xiaoyao.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author xiaoyao
 * 字节输出流
 * @create 2022-11-17 23:03
 */
public class FileOutPutStreamConstructor {
    public static void main(String[] args) throws FileNotFoundException {
        // 1.指定文件路径
        File file = new File("source/com/xiaoyao/IO/a.txt");

        //2.使用文件对象创建一个字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        //2.1或者使用文件路径创建一个流对象
        FileOutputStream fileOutputStream1 = new FileOutputStream("source/com/xiaoyao/IO/b.txt");

    }
}
