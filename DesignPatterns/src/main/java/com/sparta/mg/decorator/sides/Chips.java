package com.sparta.mg.decorator.sides;

import com.sparta.mg.decorator.Pizza;

public class Chips extends Sides{

    public Chips(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
