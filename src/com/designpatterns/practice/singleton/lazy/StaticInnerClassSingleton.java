package com.designpatterns.practice.singleton.lazy;

/**
 * 静态内部类：在内部类被加载和初始化时，才创建 instance 实例对象
 *
 * 因为内部类是在加载和初始化时创建的，所以是线程安全的（逻辑同 PlainSingleton 中的那样）
 *
 * 知识点：静态内部类不会自动随着外部类的加载和初始化而初始化。
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {}

    private static class Inner {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return Inner.INSTANCE;
    }
}
