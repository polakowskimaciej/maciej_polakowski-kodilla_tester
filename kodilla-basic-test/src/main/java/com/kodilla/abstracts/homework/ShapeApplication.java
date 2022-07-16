package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getCircumference());
        Square square = new Square(4,10);
        System.out.println(square.getArea());
        System.out.println(square.getCircumference());
        Hexagon hexagon = new Hexagon(6,10);
        System.out.println(hexagon.getArea());
        System.out.println(hexagon.getCircumference());
    }
}
