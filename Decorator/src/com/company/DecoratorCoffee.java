package com.company;

public abstract class DecoratorCoffee implements Coffee {

    protected Coffee coffee;

    public DecoratorCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
