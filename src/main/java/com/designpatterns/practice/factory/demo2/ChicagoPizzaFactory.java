package com.designpatterns.practice.factory.demo2;

import com.designpatterns.practice.factory.demo1.Pizza;

public class ChicagoPizzaFactory extends SimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        return new Pizza();
    }
}
