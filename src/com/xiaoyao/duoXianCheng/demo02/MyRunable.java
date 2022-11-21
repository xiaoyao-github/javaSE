package com.xiaoyao.duoXianCheng.demo02;

/**
 * @author xiaoyao
 * @create 2022-11-21 21:53
 */
public class MyRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程执行："+i);
        }
    }
}
