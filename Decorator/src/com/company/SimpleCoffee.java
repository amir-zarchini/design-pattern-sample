package com.company;

public class SimpleCoffee implements Coffee {

    @Override
    public double getPrice() {
        return 25000;
    }

    @Override
    public String getDescription() {
        return "order simple-coffee";
    }
}
