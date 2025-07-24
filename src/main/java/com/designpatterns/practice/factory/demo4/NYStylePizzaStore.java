package com.designpatterns.practice.factory.demo4;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if ("c".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("纽约口味的芝士披萨");
        } else if ("g".equals(type)) {

        } else {

        }
        return pizza;
    }
}
