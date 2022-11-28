package com.xiaoyao.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xiaoyao
 * @create 2022-11-25 21:40
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张杰");
        list.add("张三丰");
        nameList = list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());

        Stream<String> stream = list.stream();
        List<String> list1 = stream.filter(s -> s.startsWith("张")).collect(Collectors.toList());

        System.out.println(list1.toString());
        System.out.println(nameList.toString());

        list.forEach((item)->{
            System.out.println(item);
        });

        list.forEach(System.out::println);


    }
}
