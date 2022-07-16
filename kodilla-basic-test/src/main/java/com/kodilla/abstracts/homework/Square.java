package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square(int numberOfSides, int sideLength) {
        super(4, sideLength);
    }

    @Override
    public int getCircumference() {
        int circumference = getNumberOfSides() * getSideLength();
        return circumference;
    }

    @Override
    public double getArea() {
        double area = getSideLength() * getSideLength();
        return area;
    }
}
