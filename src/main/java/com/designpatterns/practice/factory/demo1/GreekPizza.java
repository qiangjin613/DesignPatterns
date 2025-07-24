package com.designpatterns.practice.factory.demo1;

public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备一个G披萨");
    }

    @Override
    public void cut() {
        System.out.println("切成方形滴~");
    }
}
