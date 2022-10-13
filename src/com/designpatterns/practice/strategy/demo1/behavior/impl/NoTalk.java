package com.designpatterns.practice.strategy.demo1.behavior.impl;

import com.designpatterns.practice.strategy.demo1.behavior.TalkBehavior;

public class NoTalk implements TalkBehavior {
    @Override
    public void talk() {
        System.out.println("哑巴鸭子");
    }
}
