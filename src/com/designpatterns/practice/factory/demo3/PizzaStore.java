package com.designpatterns.practice.factory.demo3;

import com.designpatterns.practice.factory.demo1.Pizza;
import com.designpatterns.practice.factory.demo2.SimplePizzaFactory;

/**
 * 披萨商店
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    // 这里声明为 final 方法是不希望子类通过继承修改加工流程！
    public final Pizza orderPizza(String type) {
        // 创建一个披萨
        Pizza pizza = createPizza(type);

        // 加工
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // 返回披萨
        return pizza;
    }
}
