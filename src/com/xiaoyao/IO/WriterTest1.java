package com.xiaoyao.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author xiaoyao
 *  字符输出流
 *
 * @create 2022-11-19 0:47
 */
public class WriterTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("source/com/xiaoyao/Io/f.txt");
        FileWriter fileWriter = new FileWriter(file);
        String words = "彩屏，我有一个问题，我能约你出门吗？";

        char[] chars = words.toCharArray();
        fileWriter.write(chars);
        fileWriter.close();

    }
}
