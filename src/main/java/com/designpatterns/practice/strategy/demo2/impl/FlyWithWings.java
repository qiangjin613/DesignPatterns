package com.designpatterns.practice.strategy.demo2.impl;

import com.designpatterns.practice.strategy.demo2.IFlyStrategy;

public class FlyWithWings implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("呱呱的飞了");
    }
}
