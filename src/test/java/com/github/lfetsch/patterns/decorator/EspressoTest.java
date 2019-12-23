package com.github.lfetsch.patterns.decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EspressoTest {

    private Beverage beverage;

    @Before
    public void setup() {
        beverage = new Espresso();
    }

    @Test
    public void getDescription() {
        assertEquals("Espresso", beverage.getDescription());
    }

    @Test
    public void cost() {
        assertEquals(1.99, beverage.cost(), TestSettings.DELTA);
    }
}