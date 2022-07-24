package com.kodilla.collections.interfaces;

public class Triangle implements Shape{
    double width;
    double height;
    double hypotenuse;
    public Triangle(double width, double height, double hypotenuse){
        this.height = height;
        this.hypotenuse = hypotenuse;
        this.width = width;
    }
    @Override
    public double getArea() {
        //pole = szerokość podstawy * wysokość trójkąta / 2
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        // obwód = szerokość podstawy + wysokość trójkąta + długość przeciwprostokątnej
        return width + height + hypotenuse;
    }
}
