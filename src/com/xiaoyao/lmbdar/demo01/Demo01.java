package com.xiaoyao.lmbdar.demo01;

/**
 * @author xiaoyao
 * lambdar表达式 案例1
 * @create 2022-11-23 0:39
 */
public class Demo01 {
    public static void main(String[] args) {

        new Thread(()->{
            System.out.println("第一个lambdar表达式");
        }).start();

    }
}
