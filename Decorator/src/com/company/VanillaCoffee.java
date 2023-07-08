package com.company;

public class VanillaCoffee extends DecoratorCoffee{

    public VanillaCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vanilla";
    }
}
