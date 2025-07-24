package com.designpatterns.practice.strategy.demo2.impl;

import com.designpatterns.practice.strategy.demo2.IQuackStrategy;

public class BiuBiuQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("小嘴biabia的");
    }
}
