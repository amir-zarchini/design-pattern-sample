package com.company.concreteClass;

import com.company.concreteClass.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("created square");
    }
}
