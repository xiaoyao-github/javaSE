package com.xiaoyao.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author xiaoyao
 * 字节输入流使用案例1
 * @create 2022-11-18 23:11
 */
public class FileInPutStreamTest1 {
    public static void main(String[] args) throws IOException {
        // 1.创建字节输入流对象
        //文件内容 xiaoyao hancaiping
        File file = new File("source/com/xiaoyao/Io/c.txt");
        //文件内容 肖瑶 韩彩屏
        File file2 = new File("source/com/xiaoyao/Io/d.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int read = 0;
        // 2.读取文件内容 --读出来的是ASCII
        //System.out.println(fileInputStream.read());
        // 3.想要独处里面的内容需要将字节转为字符char，属于向上自动转型
        // 4.每次读取一个字符文件内容为英文字母
        /* System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);
        read = fileInputStream.read();
        System.out.println((char) read);*/

        /*while ((read = fileInputStream.read()) != -1){
            System.out.println((char) read);
        }*/

        int len;
        //定义一个字节数组字节输入流每次读取一个字节数组的长度。
        byte[] b = new byte[2];
        while ((len = fileInputStream.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        fileInputStream.close();

        //字节输入流就是不能读取中文内容
        FileInputStream fileInputStream1 = new FileInputStream(file2);
        int read1;
        while ((read1 = fileInputStream1.read(b)) != -1){
            System.out.println(new String(b,0,read1));
        }


    }
}
