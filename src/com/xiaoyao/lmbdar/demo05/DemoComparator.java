package com.xiaoyao.lmbdar.demo05;
import java.util.Arrays;
import java.util.Comparator;
/**
* @author 肖瑶
* @date 2020/2/7 17:41
*/


public class DemoComparator {
    public static void main(String[] args) {
        // 本来年龄乱序的对象数组
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20) };
        // 匿名内部类
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array, comp); // //第一个是排序对象 第二个参数为排序规则，即Comparator接口实例
        for (Person person : array) {
            System.out.println(person);
        }
    }
}