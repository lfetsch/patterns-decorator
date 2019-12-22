package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseBlendTest {

    private Beverage beverage;

    @Before
    public void setup() {
        beverage = new HouseBlend();
    }

    @Test
    public void getDescription() {
        assertEquals("House Blend", beverage.getDescription());
    }

    @Test
    public void cost() {
        assertEquals(0.89, beverage.cost(), TestSettings.DELTA);
    }
}