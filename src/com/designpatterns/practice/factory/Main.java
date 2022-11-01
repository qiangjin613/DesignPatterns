package com.designpatterns.practice.factory;

import com.designpatterns.practice.factory.demo1.Pizza;
import com.designpatterns.practice.factory.demo3.NYStylePizzaStore;
import com.designpatterns.practice.factory.demo3.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new NYStylePizzaStore();
        store.orderPizza("c");


    }
}
