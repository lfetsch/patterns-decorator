package com.github.lfetsch.patterns.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    double cost() {
        return 0.89;
    }
}
