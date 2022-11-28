package com.xiaoyao.lmbdar.demo05;

import java.util.Arrays;
import java.util.Comparator;

public class DemoLambda {
    public static void main(String[] args) {
        Person[] array={
            new Person("迪丽热巴",18),
            new Person("古力娜扎",19),
            new Person("马尔扎哈",20)
        };
        Arrays.sort(array,(Person a, Person b) ->{
            return a.getAge()-b.getAge();
        });

        //Arrays.sort(array, Comparator ::);
        for (Person person : array) {
            System.out.println(person);
        }
    }
}