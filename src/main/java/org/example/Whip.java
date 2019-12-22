package org.example;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s, Whip", beverage.getDescription());
    }

    @Override
    double cost() {
        return beverage.cost() + 0.10;
    }
}
