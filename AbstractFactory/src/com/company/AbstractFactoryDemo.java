package com.company;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape_factory");
        Shape rectangleShape =  shapeFactory.getShape("rectangle");
        rectangleShape.draw();
        AbstractFactory roundedFactory = FactoryProducer.getFactory("rounded_factory");
        Shape roundedRectangle = roundedFactory.getShape("rectangle_rounded");
        roundedRectangle.draw();

    }
}
