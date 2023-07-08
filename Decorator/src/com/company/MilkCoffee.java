package com.company;

public class MilkCoffee extends DecoratorCoffee{

    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }
}
