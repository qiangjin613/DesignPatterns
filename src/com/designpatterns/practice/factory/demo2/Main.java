package com.designpatterns.practice.factory.demo2;

import com.designpatterns.practice.factory.demo1.Pizza;

public class Main {
    public static void main(String[] args) {
//        Pizza pizza = new PizzaStore().createPizza()
        Pizza pizza = new PizzaStore().orderPizza(new ChicagoPizzaFactory(), "c");



        // 一个在客户端不遵守Pizza 制作工艺的办法：
        Pizza p2 = new ChicagoPizzaFactory().createPizza("c");
        p2.prepare();
        p2.box();
    }
}
