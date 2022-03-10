package com.designpatterns.practice.singleton;

/**
 * 经典的 单例模式
 * 单线程是木有问题，但是在多线程环境下，有很多问题...
 */
class SingletonDemo {

    private static SingletonDemo instance = null;

    /* 构造器私有化，防止外部创建实例 */
    private SingletonDemo() {
        System.out.println(Thread.currentThread().getName() + " 构造器实例话对象");
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
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
                SingletonDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}

/**
 * 多线程下的单例模式版本
 * v1：使用 synchronized 解决。
 *      但是，synchronized 是重锁，会导致并发性下降，杀鸡用牛刀！
 */
class SingletonDemo1 {

    private static SingletonDemo1 instance = null;

    /* 构造器私有化，防止外部创建实例 */
    private SingletonDemo1() {
        System.out.println(Thread.currentThread().getName() + " 构造器实例话对象");
    }

    // 使用 synchronized 解决多线程环境下的并发问题
    public static synchronized SingletonDemo1 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo1();
        }
        return instance;
    }

    public static void main(String[] args) {
        // 多线程下对单例的测试
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonDemo1.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}

/**
 * 多线程下的单例模式版本，基于 v1 版本的优化
 * v2：使用 DCL（Double Check Lock，双端检索机制）对 synchronized 进行替换
 *
 * But.... 因为多线程环境下的指令重排，还是有问题！
 * 原因在于某一个线程执行到第一次检测，读取到的 instance != null 时，instance 的引用对象可能没有完成初始化。
 * instance = new SingletonDemo3() 可以分为一下 3 步：（伪代码）
 * （1）memory = allocate(); // 1.分配对象内存空间
 * （2）instance(memory); // 2. 初始化对象
 * （3）instance = memory; // 3. 设置instance指向刚分配的内存地址，此时instance! =null
 * 步骤2 和 步骤3 不存在数据依赖关系，而且无论重排前还是重排后程序的执行结果在单线程中并没有改变，因此这种重排优化是允许的。
 * 会引起问题的重排：
 * （1）memory = allocate();
 * （3）instance = memory; // 3.但是此时对象还没有初始化完成
 * （2）instance(memory); // 2.初始化对象
 * 如果在对象初始化没有完成时，其他的线程获取这个对象进行操作，就会引发问题。
 */
class SingletonDemo2 {

    private static SingletonDemo2 instance = null;

    /* 构造器私有化，防止外部创建实例 */
    private SingletonDemo2() {
        System.out.println(Thread.currentThread().getName() + " 构造器实例话对象");
    }

    // 使用 DCL 解决：在加锁之前，加锁之后都进行判断
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo2.class) {
                if (instance == null) {
                    instance = new SingletonDemo2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // 多线程下对单例的测试
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonDemo2.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}

/**
 * 多线程下的单例模式版本，基于 v2 版本的优化
 * DCL 机制不一定线程安全，原因是有指令重排序的存在，加入 volatile 可以禁止指令重排
 * v3：使用 volatile 解决因为指令重排造成的 DCL 不一定线程安全的问题
 */
class SingletonDemo3 {

    private static volatile SingletonDemo3 instance = null;

    /* 构造器私有化，防止外部创建实例 */
    private SingletonDemo3() {
        System.out.println(Thread.currentThread().getName() + " 构造器实例话对象");
    }

    // 使用 DCL 解决：在加锁之前，加锁之后都进行判断
    public static synchronized SingletonDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo.class) {
                if (instance == null) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        // 多线程下对单例的测试
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonDemo3.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
