package com.designpatterns.practice.strategy.demo2;

import com.designpatterns.practice.strategy.demo2.impl.BiuBiuQuack;
import com.designpatterns.practice.strategy.demo2.impl.NoFly;

public class LittleDuck extends Duck {

    public LittleDuck() {
        super.flyStrategy = new NoFly();
        super.quackStrategy = new BiuBiuQuack();
    }

    @Override
    String getName() {
        return "小鸭子";
    }
}
