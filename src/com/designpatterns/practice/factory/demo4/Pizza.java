package com.designpatterns.practice.factory.demo4;

/**
 * 抽象的披萨类
 */
public abstract class Pizza {

    String name;

    // 每个披萨都有会用到的原材料
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;

    public abstract void prepare();

    public void bake() {
        System.out.println("这是什么。。。");
    }

    public void cut() {
        System.out.println("切割。。。");
    }

    public void box() {
        System.out.println("打包装箱");
    }

    void setName(String name) {
        this.name = name;
    }
}
