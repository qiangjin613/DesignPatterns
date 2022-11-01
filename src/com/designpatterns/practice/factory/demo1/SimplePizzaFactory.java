package com.designpatterns.practice.factory.demo1;

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


//class SubSimplePizzaFactory extends SimplePizzaFactory {
//
//    @Override
//    public static Pizza createPizza(String type) {
//        Pizza pizza;
//        if ("c".equals(type)) {
//            pizza = new GreekPizza();
//        } else if ("g".equals(type)) {
//            pizza = new CheesePizza();
//        } else {
//            pizza = new Pizza();
//        }
//        return pizza;
//    }
//}