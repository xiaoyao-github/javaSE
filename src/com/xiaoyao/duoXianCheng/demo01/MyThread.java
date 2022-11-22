package com.xiaoyao.duoXianCheng.demo01;

/**
 * @author xiaoyao
 * 创建线程方式一：继承Thread类，重写里面的run()方法
 * @create 2022-11-21 21:43
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"正在执行："+i);
        }
    }
}
