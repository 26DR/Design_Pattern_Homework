package com.company.decorator;

import com.company.products.PizzaOrder;

public abstract class PizzaOrderExtraIngerdientsAdder extends PizzaOrder {

  public abstract String addIngredients();
  public abstract double increasePizzaPrice();
}
