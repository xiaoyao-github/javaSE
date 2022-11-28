package com.xiaoyao.lmbdar.demo07;

/**
 * @author xiaoyao
 * @create 2022-11-27 21:50
 */
public class Demo01 {
    public static void main(String[] args) {

        //lambda表达式
        fun01((s)->{
            return s.toUpperCase();
        });

        // 方法引用
        PrintString printString = new PrintString();

        fun01(printString::upperString);

        fun01(String::toUpperCase);



    }
    private static void fun01(Printable printable){
        System.out.println(printable.printUpperString("helloworld"));
    }
}
