package com.xiaoyao.lmbdar.demo06;

/**
 * @author xiaoyao
 * @create 2022-11-27 15:29
 */
public class MainTest {
    public static void main(String[] args) {
        // 主方法调用的方式
        Eatable eatable = new EatableIml();
        eatable.eat();

        //匿名内部类的方式
        invokeEat(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，疾病远离我，内部类的方式");
            }
        });

        // lambda表达式
        invokeEat(() -> {
            System.out.println("一天一苹果，疾病远离我，lambda表达式的方式。");
        });

        // 使用lambda表达式，有参无返回值方法
        useFlyable((a)->{
            System.out.println(a);
        });

        // 使用lambda表达式有参有返回值
        useAdd((int a,int b)->{
            return a+b;
        });
    }

    private static void invokeEat(Eatable eatable){
        eatable.eat();
    }

    private static void useFlyable(Flyable flyable){
        flyable.fly("一天一苹果，疾病远离我，有参无返回值形式");
    }

    private static void useAdd(Addable addable){
        int add = addable.add(10, 20);
        System.out.println(add);

    }
}
