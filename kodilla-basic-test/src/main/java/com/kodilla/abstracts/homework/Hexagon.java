package com.kodilla.abstracts.homework;

public class Hexagon extends Shape{

    public Hexagon(int numberOfSides, int sideLength) {
        super(6, sideLength);
    }

    @Override
    public int getCircumference() {
        int circumference = getNumberOfSides() * getSideLength();
        return circumference;
    }

    @Override
    public double getArea() {
        double R = Math.sqrt(3);
        double area = (3*getSideLength()*getSideLength()*R)/2;
        return area;
    }
}
