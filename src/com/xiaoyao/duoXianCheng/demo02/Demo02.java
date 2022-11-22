package com.xiaoyao.duoXianCheng.demo02;

/**
 * @author xiaoyao
 * @create 2022-11-21 21:54
 */
public class Demo02 {
    public static void main(String[] args) {

        MyRunable myThread = new MyRunable();
        Thread mt1 = new Thread(myThread, "肖瑶");
        mt1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行循环："+i);
        }

    }
}
