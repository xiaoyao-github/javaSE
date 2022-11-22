package com.xiaoyao.duoXianCheng.demo01;

/**
 * @author xiaoyao
 *  多线程
 * @create 2022-11-21 21:41
 */
public class Demo01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("自定义线程");
        myThread.start();

        //主线程和子线程交替执行
        for (int i = 0; i < 10; i++) {
            System.out.println("正在执行主线程的循环："+i);
        }


    }
}
