package com.designpatterns.practice.factory.demo1;

public class Pizza {

    public void prepare() {
        System.out.println("准备。。原味。。。");
    }

    public void bake() {
        System.out.println("这是什么。。。");
    }

    public void cut() {
        System.out.println("切割。。。");
    }

    public void box() {
        System.out.println("打包装箱");
    }
}
