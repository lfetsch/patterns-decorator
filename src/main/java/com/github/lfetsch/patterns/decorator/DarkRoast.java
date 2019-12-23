package com.github.lfetsch.patterns.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    double cost() {
        return 0.99;
    }
}
