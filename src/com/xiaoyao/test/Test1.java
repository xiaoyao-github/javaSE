package com.xiaoyao.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author xiaoyao
 * @create 2022-11-17 23:24
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        String a = "彩屏，周末有空吗，相约看个电影。";
        byte[] bytes = a.getBytes(StandardCharsets.UTF_8);
        //byte[] bytes = a.getBytes();

        System.out.println(a);

        byte[] b = "黑马程序员".getBytes();
    }
}
