package com.company;

public class RealImage implements Image{

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("display : " + fileName);
    }
}
