package com.designpatterns.practice.factory.demo1;

/**
 * 披萨商店
 */
public class PizzaStore {

    Pizza orderPizza(String type) {
        // 使用工厂创建一个披萨
        Pizza pizza = new SimplePizzaFactory().createPizza(type);

        // 加工
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // 返回披萨
        return pizza;
    }
}
