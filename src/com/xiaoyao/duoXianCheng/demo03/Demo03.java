package com.xiaoyao.duoXianCheng.demo03;

/**
 * @author xiaoyao
 * 使用匿名内部类的方式来创建线程
 *
 * @create 2022-11-21 22:00
 */
public class Demo03 {
    public static void main(String[] args) throws InterruptedException {

        /*new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"匿名内部来中的循环："+i);
                }
            }
        };
        */
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"，匿名内部来中的循环："+i);
                }
            }
        },"匿名内部类").start();*/

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "匿名内部来中的循环：" + i);
                }
            }
        };

        Thread innerClassThread = new Thread(runnable, "匿名内部类子线程");
        innerClassThread.start();

        innerClassThread.wait(10);


        for (int i = 0; i < 10; i++) {
            System.out.println("主线程中的循环："+i);
        }
    }
}
