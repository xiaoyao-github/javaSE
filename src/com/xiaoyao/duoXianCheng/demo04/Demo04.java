package com.xiaoyao.duoXianCheng.demo04;

/**
 * @author xiaoyao
 * 多线程 安全问题
 *
 * @create 2022-11-21 22:07
 */
public class Demo04 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread,"窗口1").start();
        new Thread(myThread,"窗口2").start();
        new Thread(myThread,"窗口3").start();

    }
}
