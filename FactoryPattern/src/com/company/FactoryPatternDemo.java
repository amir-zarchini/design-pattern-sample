package com.company;

import com.company.concreteClass.Shape;

public class FactoryPatternDemo {

    public static void main(String[] args) {
	    ShapeFactory shapeFactory = new ShapeFactory();

	// new instance from circle object
        Shape shape_circle = shapeFactory.getShape("circle");
        shape_circle.draw();

	// new instance from rectangle object  
        Shape shape_rectangle = shapeFactory.getShape("rectangle");
        shape_rectangle.draw();

	// new instance from square object
        Shape shape_square = shapeFactory.getShape("square");
        shape_square.draw();

    }
}
