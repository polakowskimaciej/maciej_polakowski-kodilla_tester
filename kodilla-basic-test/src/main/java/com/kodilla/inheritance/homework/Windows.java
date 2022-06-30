package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.print("Windows turned On");
    }
    @Override
    public void turnOff()
    {
        System.out.print("Windows turned Off");
    }
    public Windows(int year) {
        super(year);
        System.out.println("Windows constructor");
    }
}
