package com.github.lfetsch.patterns.decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeverageBuilderTest {

    BeverageBuilder builder;

    @Before
    public void setup() {
        builder = new BeverageBuilder(new Espresso());
    }

    @Test
    public void defaultBuilder() {
        Beverage beverage = builder.getBeverage();
        assertEquals(1.99, beverage.cost(), TestSettings.DELTA);
    }

    @Test
    public void addWhip() {
        builder.addWhip();
        Beverage beverage = builder.getBeverage();
        assertEquals(2.09, beverage.cost(), TestSettings.DELTA);
    }

    @Test
    public void addWhipWhip() {
        builder.addWhip();
        builder.addWhip();
        Beverage beverage = builder.getBeverage();
        assertEquals(2.19, beverage.cost(), TestSettings.DELTA);
    }

    @Test
    public void addMocha() {
        builder.addMocha();
        Beverage beverage = builder.getBeverage();
        assertEquals(2.19, beverage.cost(), TestSettings.DELTA);
    }

    @Test
    public void addMochaMocha() {
        builder.addMocha();
        builder.addMocha();
        Beverage beverage = builder.getBeverage();
        assertEquals(2.39, beverage.cost(), TestSettings.DELTA);
    }

    @Test
    public void removeWhip() {
        builder.addWhip();
        builder.removeWhip();
        Beverage beverage = builder.getBeverage();
        assertEquals(1.99, beverage.cost(), TestSettings.DELTA);
    }

    @Test
    public void removeMocha() {
        builder.addMocha();
        builder.removeMocha();
        Beverage beverage = builder.getBeverage();
        assertEquals(1.99, beverage.cost(), TestSettings.DELTA);
    }

    @Test(expected = RuntimeException.class)
    public void removeTooManyWhip() {
        builder.removeWhip();
        builder.getBeverage();
    }

    @Test(expected = RuntimeException.class)
    public void removeTooManyMocha() {
        builder.removeMocha();
        builder.getBeverage();
    }
}