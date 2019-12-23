package com.github.lfetsch.patterns.decorator;

public abstract class Beverage {
    String description = "Unknown beverage";

    String getDescription() {
        return description;
    }

    abstract double cost();
}
