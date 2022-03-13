package com.designpatterns.practice.singleton.hangry;

/**
 * 饿汉式 - 静态代码块创建实例对象
 */
public class StaticBlockSingleton {

    public static final StaticBlockSingleton INSTANCE;

    static {
        /*
         虽然这种方式与直接生命变量时实例话对象差不多，
         但是这个的好处是将声明和创建的动作分离开，
         使得我们可以在这中间做一些事情。
         比如读取配置文件参数，然后通过配置文件的修改实现单例模式中单例对象的不同
         */

        INSTANCE = new StaticBlockSingleton();
    }

    private StaticBlockSingleton() {}
}

class StaticBlockSingleton2 {

    private static final StaticBlockSingleton2 INSTANCE;

    static {
        INSTANCE = new StaticBlockSingleton2();
    }

    private StaticBlockSingleton2() {}

    public static StaticBlockSingleton2 getInstance() {
        return INSTANCE;
    }
}
