package com.designpatterns.practice.singleton.hangry;

/**
 * 饿汉式 - 直接创建实例对象
 */
public class PlainSingleton {

    public static final PlainSingleton INSTANCE = new PlainSingleton();

    private PlainSingleton() {}
}

class PlainSingleton2 {

    private static final PlainSingleton2 INSTANCE = new PlainSingleton2();

    private PlainSingleton2() {}

    public static PlainSingleton2 getInstance() {
        return INSTANCE;
    }
}
