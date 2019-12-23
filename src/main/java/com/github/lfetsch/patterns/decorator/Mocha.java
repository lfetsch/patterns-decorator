package com.github.lfetsch.patterns.decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Mocha", beverage.getDescription());
    }

    @Override
    double cost() {
        return beverage.cost() + 0.20;
    }
}
