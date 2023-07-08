package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleCoffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getPrice()); // 25000
        System.out.println(simpleCoffee.getDescription()); // Simple Coffee

        MilkCoffee milk_coffee = new MilkCoffee(simpleCoffee);
        System.out.println(milk_coffee.getPrice()); // 25000 + 10000
        System.out.println(milk_coffee.getDescription()); // Simple Coffee, Milk

        VanillaCoffee vanilla_coffee = new VanillaCoffee(simpleCoffee);
        System.out.println(vanilla_coffee.getPrice()); // 25000 + 10000
        System.out.println(vanilla_coffee.getDescription()); // simple coffee, vanilla

        VanillaCoffee milk_and_vanilla_Coffee = new VanillaCoffee(milk_coffee);
        System.out.println(milk_and_vanilla_Coffee.getPrice()); // 25000 + 10000
        System.out.println(milk_and_vanilla_Coffee.getDescription()); // simple coffee, vanilla
    }
}
