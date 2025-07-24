package com.designpatterns.practice.strategy.demo1.behavior.impl;

import com.designpatterns.practice.strategy.demo1.behavior.FlyBehavior;

/**
 * 具体的飞行方法
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子只是飞了");
    }
}
