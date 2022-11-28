package com.xiaoyao.test;

import java.util.function.Predicate;

/**
 * @author xiaoyao
 * @create 2022-11-25 0:18
 */

public class Test6 {

    public static void main(String[] args) {

        Predicate<String> predicate = (s)->s.length() > 5;
        Predicate<String> predicate2 = (s)->s.contains("h");

        if (predicate.and(predicate2).test("hell")){
            System.out.println("韩彩屏");
        }
    }
}
