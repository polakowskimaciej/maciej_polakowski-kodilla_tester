package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
    this.year = year;
    }
    public void turnOn() {
        System.out.println("Turned on");
    }
    public void turnOff() {
        System.out.println("Turned off");
    }
    }

