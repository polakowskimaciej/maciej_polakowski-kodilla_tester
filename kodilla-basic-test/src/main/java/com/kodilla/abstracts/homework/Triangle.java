package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    public Triangle(int numberOfSides, int sideLength) {
        super(3, sideLength);
    }

    @Override
    public int getCircumference() {
        int circumference = getNumberOfSides() * getSideLength();
        return circumference;
    }

    @Override
    public double getArea() {
        double R = Math.sqrt(3);
        double area = (getSideLength()* getSideLength() * R)/4;
        return area;
    }
}
