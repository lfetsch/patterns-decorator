package com.github.lfetsch.patterns.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeverageFormatTest {

    @Test
    public void format() {
        Beverage beverage = new BeverageBuilder(new Espresso())
                .addMocha()
                .addWhip()
                .getBeverage();

        assertEquals("Espresso, Whip, Mocha - $2.29", new BeverageFormat().format(beverage));
    }
}