package com.company;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType){
        if (factoryType.equalsIgnoreCase("shape_factory")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("rounded_factory")) {
            return new RoundedFactory();
        }
        return null;
    }
}
