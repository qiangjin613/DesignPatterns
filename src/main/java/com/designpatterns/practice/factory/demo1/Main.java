package com.designpatterns.practice.factory.demo1;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaStore().orderPizza("g");
    }
}
