package com.company;

import com.company.concreteClass.Circle;
import com.company.concreteClass.Rectangle;
import com.company.concreteClass.Shape;
import com.company.concreteClass.Square;

public class ShapeFactory {

    public Shape getShape( String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
