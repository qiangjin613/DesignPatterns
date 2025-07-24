package com.designpatterns.practice.strategy.demo2;

/**
 * 鸭子
 */
public abstract class Duck {

    protected IFlyStrategy flyStrategy;
    protected IQuackStrategy quackStrategy;

    abstract String getName();

    public void fly() {
        flyStrategy.fly();
    }



    public void quack() {
        quackStrategy.quack();
    }

    public void setFlyStrategy(IFlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setQuackStrategy(IQuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }
}
