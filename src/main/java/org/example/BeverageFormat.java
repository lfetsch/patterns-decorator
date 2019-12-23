package org.example;

import java.text.DecimalFormat;

public class BeverageFormat {
    public String format(Beverage beverage) {
        return String.format("%s - $%s",
                beverage.getDescription(),
                new DecimalFormat("#.0#").format(beverage.cost()));
    }
}
