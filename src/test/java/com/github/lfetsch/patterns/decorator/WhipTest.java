package com.github.lfetsch.patterns.decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhipTest {

    Beverage beverage;

    @Before
    public void setup() {
        beverage = new Whip(new HouseBlend());
    }

    @Test
    public void getDescription() {
        assertEquals("House Blend, Whip", beverage.getDescription());
    }

    @Test
    public void cost() {
        assertEquals(0.99, beverage.cost(), TestSettings.DELTA);
    }
}