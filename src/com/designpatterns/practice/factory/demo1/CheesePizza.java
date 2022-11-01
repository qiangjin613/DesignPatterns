package com.designpatterns.practice.factory.demo1;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("芝士披萨");
    }

    @Override
    public void bake() {
        System.out.println("不加芝麻");
    }

    @Override
    public void cut() {
        System.out.println("一锅大小");
    }
}
