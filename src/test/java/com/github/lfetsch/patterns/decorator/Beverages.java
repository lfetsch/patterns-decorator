package com.github.lfetsch.patterns.decorator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Beverages {

    @Test
    public void costOfBeverages() {
        List<Beverage> beverages = new ArrayList<>();
        beverages.add(new BeverageBuilder(new DarkRoast()).addMocha().getBeverage());
        beverages.add(new BeverageBuilder(new HouseBlend()).addWhip().getBeverage());
        double cost = beverages.stream().mapToDouble(Beverage::cost).sum();
        assertEquals(0.89 + 0.2 + 0.99 + 0.1, cost, TestSettings.DELTA);
    }
}
