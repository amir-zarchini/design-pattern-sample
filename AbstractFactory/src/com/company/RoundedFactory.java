package com.company;

public class RoundedFactory implements AbstractFactory{

    @Override
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("rectangle_rounded")) {
            return new RectangleRounded();
        } else if (shapeType.equalsIgnoreCase("square_rounded")) {
            return new SquareRounded();
        }
        return null;
    }
}
