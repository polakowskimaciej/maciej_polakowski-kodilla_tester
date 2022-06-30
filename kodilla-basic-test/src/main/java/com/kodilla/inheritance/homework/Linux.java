package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.print("Linux turned On");
    }
    @Override
    public void turnOff()
    {
        System.out.print("Linux turned Off");
    }
    public Linux(int year) {
        super(year);
        System.out.println("Linux constructor");
    }
}
