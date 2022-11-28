package com.xiaoyao.lmbdar.demo04;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author xiaoyao
 * @create 2022-11-24 23:36
 */
public class Demo01 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("lambda表达式创建线程。");
        }).start();
        // 无参无返回
        fun01();
        // 有参无返回值
        fun02();

    }

    /**
     * 无参无返回值
     */
    public static void fun01(){
        Runnable runnable = ()-> System.out.println("无参无返回值得Lambda表达式。");
        runnable.run();

    }

    /**
     * 有参无返回值得lambda表达式
     */
    public static void fun02(){
        Consumer<String> consumer = (x)-> System.out.println("hello,"+x);
        consumer.accept("韩彩屏");
    }

    public static void test2(){
        Comparator<Integer> comparable=(x, y)->Integer.compare(x,y);
//使用方法引用实现相同效果
        Comparator<Integer> integerComparable=Integer::compare;
        System.out.println(integerComparable.compare(4,2));//结果：1
        System.out.println(comparable.compare(4,2));//结果：1
    }
}
