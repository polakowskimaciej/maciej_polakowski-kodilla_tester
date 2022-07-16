package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int numberOfSides;
    private int sideLength;
    public Shape(int numberOfSides,int sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }
    public int getSideLength() {
        return sideLength;
    }
    public abstract int getCircumference();
    public abstract double getArea();
}
