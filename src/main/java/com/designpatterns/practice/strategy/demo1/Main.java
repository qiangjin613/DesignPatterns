package com.designpatterns.practice.strategy.demo1;

import com.designpatterns.practice.strategy.demo1.behavior.impl.FlyWithXuan;

/**
 * Demo1 的客户端使用类
 */
public class Main {
    public static void main(String[] args) {
        Duck duck = new DaiDaiDuck();
        duck.fly();
        duck.talk();
        duck.type();

        duck.setFlyBehavior(new FlyWithXuan());
        duck.fly();
    }
}
