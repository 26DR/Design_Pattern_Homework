package com.company.decorator;

import com.company.products.Pizza;

public abstract class PizzaExtraIngerdientsAdder extends Pizza {

  public abstract String addIngredients();
  public abstract double increasePizzaPrice();
}
