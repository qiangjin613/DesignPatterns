package com.designpatterns.practice.strategy.demo1;

import com.designpatterns.practice.strategy.demo1.behavior.FlyBehavior;
import com.designpatterns.practice.strategy.demo1.behavior.TalkBehavior;
import com.designpatterns.practice.strategy.demo1.behavior.impl.FlyNoWay;
import com.designpatterns.practice.strategy.demo1.behavior.impl.NoTalk;

/**
 * "抽象"鸭
 *
 * 1. 易变行为：fly、talk
 * 2. 不变行为：type
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    TalkBehavior talkBehavior;

    public Duck() {}

    abstract void type();

    /**
     * flay 行为委托给了 flyBehavior
     */
    void fly() {
        flyBehavior.fly();
    };

    void talk() {
        talkBehavior.talk();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setTalkBehavior(TalkBehavior talkBehavior) {
        this.talkBehavior = talkBehavior;
    }
}
