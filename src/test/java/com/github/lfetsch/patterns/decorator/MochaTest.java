package com.github.lfetsch.patterns.decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MochaTest {

    Beverage beverage;

    @Before
    public void setup() {
        beverage = new Mocha(new DarkRoast());
    }

    @Test
    public void getDescription() {
        assertEquals("Dark Roast, Mocha", beverage.getDescription());
    }

    @Test
    public void cost() {
        assertEquals(1.19, beverage.cost(), TestSettings.DELTA);
    }
}