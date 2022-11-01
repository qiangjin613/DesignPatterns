package com.designpatterns.practice.factory.demo4;

/**
 * 原料工厂
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
}
