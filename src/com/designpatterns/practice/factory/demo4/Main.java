package com.designpatterns.practice.factory.demo4;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("c");
    }
}
