package com.designpatterns.practice.factory.demo2;

import com.designpatterns.practice.factory.demo1.CheesePizza;
import com.designpatterns.practice.factory.demo1.GreekPizza;
import com.designpatterns.practice.factory.demo1.Pizza;
import com.designpatterns.practice.factory.demo2.SimplePizzaFactory;

/**
 * 披萨商店
 */
public class PizzaStore {

    public Pizza orderPizza(SimplePizzaFactory factory, String type) {
        // 创建一个披萨
        Pizza pizza = factory.createPizza(type);

        // 加工
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // 返回披萨
        return pizza;
    }
}

class PizzaStore2 {

    SimplePizzaFactory factory;

    public PizzaStore2(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        // 创建一个披萨
        Pizza pizza = factory.createPizza(type);

        // 加工
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // 返回披萨
        return pizza;
    }
}
