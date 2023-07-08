package com.company;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Circle> circleColoredMap = new HashMap();

    public static Circle getColoredCircle(String color) {
        Circle circle = circleColoredMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleColoredMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
