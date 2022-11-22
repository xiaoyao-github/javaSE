package com.xiaoyao.duoXianCheng.demo04;

/**
 * @author xiaoyao
 * 加同步锁 防止线程冲突
 * @create 2022-11-21 22:14
 */
public class MyThread implements Runnable{

    //模拟买票
    private int tickets = 100;
    Object lock = new Object();

    @Override
    public void run() {

        while (true){
            synchronized (lock){
                if (tickets > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name+",正在卖第"+tickets--+"张票");
                }
            }

        }
    }
}
