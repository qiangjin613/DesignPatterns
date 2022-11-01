package com.designpatterns.practice.adapter.demo1;

import com.designpatterns.practice.adapter.demo1.impl.WildTurkey;

public class Main {
    public static void main(String[] args) {
        Duck likeDuck = new TurkeyAdapter(new WildTurkey());
        testDuck(likeDuck);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
