package com.company;

import com.company.concreteClass.Shape;

public class FactoryPatternDemo {

    public static void main(String[] args) {
	    ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape_circle = shapeFactory.getShape("circle");
        shape_circle.draw();
        Shape shape_rectangle = shapeFactory.getShape("rectangle");
        shape_rectangle.draw();
        Shape shape_square = shapeFactory.getShape("square");
        shape_square.draw();

    }
}
