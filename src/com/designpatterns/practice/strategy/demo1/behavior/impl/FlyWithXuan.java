package com.designpatterns.practice.strategy.demo1.behavior.impl;

import com.designpatterns.practice.strategy.demo1.behavior.FlyBehavior;

public class FlyWithXuan implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子飞走了并且炫了一个");
    }
}
