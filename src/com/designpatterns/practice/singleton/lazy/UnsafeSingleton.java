package com.designpatterns.practice.singleton.lazy;

/**
 * 单线程下的懒汉式：存在线程安全问题
 */
public class UnsafeSingleton {

    private static UnsafeSingleton instance = null;

    /* 构造器私有化，防止外部创建实例 */
    private UnsafeSingleton() {
        System.out.println(Thread.currentThread().getName() + " 构造器实例话对象");
    }

    public static UnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new UnsafeSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        // 1. 单线程下是安全的
//        for (int i = 0; i < 100; i++) {
//            System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
//        }

        // 2. 多线程下对单例的测试
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                UnsafeSingleton.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
