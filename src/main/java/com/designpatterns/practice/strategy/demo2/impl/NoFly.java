package com.designpatterns.practice.strategy.demo2.impl;

import com.designpatterns.practice.strategy.demo2.IFlyStrategy;

public class NoFly implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("是真不会飞");
    }
}
