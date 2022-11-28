package com.xiaoyao.lmbdar.demo04;

/**
 * @author xiaoyao
 * @create 2022-11-25 0:04
 */

@FunctionalInterface
public interface Demo02 {
    int fun01();

    default int fun02() {
        return 0;
    }

    static String fun03(Object object) {
        return null;
    }

    //boolean fun04(Object object);

    boolean  equals(Object obj);
}

