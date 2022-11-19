package com.xiaoyao.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author xiaoyao
 * 字节输入流构造方法
 *
 * @create 2022-11-18 23:07
 */
public class FileInPutStreamConstructor {
    public static void main(String[] args) throws FileNotFoundException {

        // 1.需要指定一个存在的路径的文件对象才能创建字节输入流
        File file = new File("source/com/xiaoyao/Io/a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);



    }
}
