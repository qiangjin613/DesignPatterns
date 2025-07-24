package com.designpatterns.practice.strategy.demo1;

import com.designpatterns.practice.strategy.demo1.behavior.impl.FlyNoWay;
import com.designpatterns.practice.strategy.demo1.behavior.impl.NoTalk;

public class DaiDaiDuck extends Duck {

    public DaiDaiDuck() {
        // 默认策略
        flyBehavior = new FlyNoWay();
        talkBehavior = new NoTalk();
    }

    @Override
    void type() {
        System.out.println("呆呆鸭~");
    }
}
