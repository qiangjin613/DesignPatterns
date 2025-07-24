package com.designpatterns.practice.strategy.demo2.impl;

import com.designpatterns.practice.strategy.demo2.IQuackStrategy;

public class NoQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("保持沉默才是最好的！");
    }
}
