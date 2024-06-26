package com.sparta.ey.decorator;

public class Italian extends Pizza {
    public Italian(String description, double cost) {
        super(description, cost);
    }

    @Override
    public String getDescription() {
        return "chicago";
    }

    @Override
    public double getCost() {
        return 30;
    }

}
