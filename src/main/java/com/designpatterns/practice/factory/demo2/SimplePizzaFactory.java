package com.designpatterns.practice.factory.demo2;

import com.designpatterns.practice.factory.demo1.CheesePizza;
import com.designpatterns.practice.factory.demo1.GreekPizza;
import com.designpatterns.practice.factory.demo1.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if ("c".equals(type)) {
            pizza = new GreekPizza();
        } else if ("g".equals(type)) {
            pizza = new CheesePizza();
        } else {
            pizza = new Pizza();
        }
        return pizza;
    }
}
