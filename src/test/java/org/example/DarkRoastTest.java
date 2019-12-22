package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkRoastTest {

    private Beverage beverage;

    @Before
    public void setup() {
        beverage = new DarkRoast();
    }

    @Test
    public void getDescription() {
        assertEquals("Dark Roast", beverage.getDescription());
    }

    @Test
    public void cost() {
        assertEquals(0.99, beverage.cost(), TestSettings.DELTA);
    }
}
