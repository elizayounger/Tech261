package com.sparta.mg.decorator.sides;

import com.sparta.mg.decorator.Pizza;

public class Salad extends Sides{

    public Salad(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and salad";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
