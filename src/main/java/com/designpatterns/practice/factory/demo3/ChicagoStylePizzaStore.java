package com.designpatterns.practice.factory.demo3;

import com.designpatterns.practice.factory.demo1.CheesePizza;
import com.designpatterns.practice.factory.demo1.GreekPizza;
import com.designpatterns.practice.factory.demo1.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
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
