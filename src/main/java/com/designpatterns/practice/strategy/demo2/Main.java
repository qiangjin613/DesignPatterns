package com.designpatterns.practice.strategy.demo2;

public class Main {
    public static void main(String[] args) {
        Duck duck = new LittleDuck();
        System.out.println(duck.getName());
        duck.fly();
        duck.quack();
    }
}
