package com.github.lfetsch.patterns.decorator;

public class BeverageBuilder {
    final Beverage beverage;
    int whipCount = 0;
    int mochaCount = 0;

    public BeverageBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageBuilder addWhip() {
        whipCount++;
        return this;
    }

    public BeverageBuilder addMocha() {
        mochaCount++;
        return this;
    }

    public BeverageBuilder removeWhip() {
        if (whipCount <= 0) {
            throw new RuntimeException("No whips to remove");
        }
        whipCount--;
        return this;
    }

    public BeverageBuilder removeMocha() {
        if (mochaCount <= 0) {
            throw new RuntimeException("No mochas to remove");
        }
        mochaCount--;
        return this;
    }

    public Beverage getBeverage() {
        Beverage newBeverage = beverage;

        for (int whip = 0; whip < whipCount; whip++) {
            newBeverage = new Whip(newBeverage);
        }

        for (int mocha = 0; mocha < mochaCount; mocha++) {
            newBeverage = new Mocha(newBeverage);
        }

        return newBeverage;
    }
}
