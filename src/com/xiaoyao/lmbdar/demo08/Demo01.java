package com.xiaoyao.lmbdar.demo08;

/**
 * @author xiaoyao
 * @create 2022-11-27 22:29
 */
public class Demo01 {
    public static void main(String[] args) {
        //lambda表达式方式
        fun01((String s,int a,int b)->{
            //System.out.println(s.substring(a, b));
            return s.substring(a,b);
        });

        //方法引用的方式
        fun01(String::substring);

    }

    private static void fun01(Subable subable){
        String str = subable.subString("helloworld", 2, 5);

        System.out.println(str);

    }
}
