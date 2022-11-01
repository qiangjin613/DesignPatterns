package com.designpatterns.practice.adapter.demo1.impl;

import com.designpatterns.practice.adapter.demo1.Duck;

/**
 * 绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("我是绿头鸭绿头鸭~");
    }

    @Override
    public void fly() {
        System.out.println("绿头鸭要飞啦！");
    }
}
