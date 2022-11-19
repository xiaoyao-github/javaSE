package com.xiaoyao.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author xiaoyao
 *
 * 字符输入流读取有效字符
 *
 * @create 2022-11-19 0:42
 */
public class ReaderTest2 {
    public static void main(String[] args) throws IOException {
        File file = new File("source/com/xiaoyao/Io/e.txt");
        FileReader fileReader = new FileReader(file);

        int len;
        char[] chars = new char[2];

        while((len = fileReader.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }

        fileReader.close();
    }
}
