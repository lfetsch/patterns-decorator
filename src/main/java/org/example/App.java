package org.example;

public class App {
    public static void main(String[] args) {

        Beverage beverage = new BeverageBuilder(new Espresso())
                .addMocha()
                .addWhip()
                .getBeverage();

        System.out.println(new BeverageFormat().format(beverage));
    }
}
