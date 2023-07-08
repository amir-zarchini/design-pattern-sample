package com.company;

public class Main {

    private static final String colors[] = {"red", "green", "blue"};

    public static void main(String[] args) {

        for (int i = 0; i < 10; ++i) {
            Circle circle = ShapeFactory.getColoredCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
