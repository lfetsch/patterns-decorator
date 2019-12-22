package org.example;

public abstract class Beverage {
    String description = "Unknown beverage";

    String getDescription() {
        return description;
    }

    abstract double cost();
}
