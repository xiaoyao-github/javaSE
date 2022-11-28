package com.xiaoyao.lmbdar.demo02;

/**
 * @author xiaoyao
 * @create 2022-11-23 0:42
 */
public class Demo02 {
    public static void main(String[] args) {
        //匿名内部类的调用方式
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("周五有个摇滚音乐会");
            }
        });

        invokeCook(()->{
            System.out.println("彩屏，周五晚上有空吗");
        });

    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
